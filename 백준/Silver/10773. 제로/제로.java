import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Stack stack = new Stack();
        int sumOfStack = 0;
        for (int i = 0; i < n; i++) {
            int instruction = Integer.parseInt(reader.readLine());
            if (instruction == 0) {
                stack.pop();
            } else {
                stack.add(instruction);
            }
        }

        while(!stack.isEmpty()) {
            sumOfStack += (int) stack.pop();
        }
        System.out.println(sumOfStack);
    }
}