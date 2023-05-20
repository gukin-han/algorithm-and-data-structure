import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String answer = "";
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') answer += (char) (ch + 'A' - 'a');
            else if (ch >= 'A' && ch <= 'Z') answer += (char) (ch + 'a' - 'A');
        }
        System.out.println(answer);
    }
}