import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] fib = new long[n+1];

        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(1);
        } else {
            fib[0] = 0;
            fib[1] = 1;
            fib[2] = 1;
            for (int i = 3; i < fib.length; i++) {
                fib[i] = fib[i-2] + fib[i-1];
            }

            System.out.println(fib[n]);
        }

    }
}