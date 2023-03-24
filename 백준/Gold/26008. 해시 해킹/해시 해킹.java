import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nma = reader.readLine().split(" ");
        int N = Integer.parseInt(nma[0]);
        int M = Integer.parseInt(nma[1]);
        int A = Integer.parseInt(nma[2]);
        int H = Integer.parseInt(reader.readLine());

        int divisor = 1_000_000_007;
        long answer = 1;

        for (int i = 0; i < N - 1; i++) {
            answer = (answer * M) % divisor;
        }
        System.out.println(answer);
    }
}