import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine().strip();
            int numRep = Integer.parseInt(line);
            for (int i = 0; i < numRep; i++) {

                line = reader.readLine().strip();
                if (isValid(line)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        } catch (IOException e) {
            System.out.println("input error");
        }
    }

    public static boolean isValid(String line) {
        int balance = 0;
        for (char ch: line.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                balance--;
                if (balance < 0) {
                    return false;
                }
            }
        }
        return (balance == 0);
    }
}