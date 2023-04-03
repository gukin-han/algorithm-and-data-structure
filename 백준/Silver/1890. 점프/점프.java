import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        long[][] dp = new long[N][N];
        dp[0][0] = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int step = board[i][j];
                if (step != 0) {
                    if (j + step < N) {
                        dp[i][j + step] += dp[i][j];// go right
                    }

                    if (i + step < N) {
                        dp[i + step][j] += dp[i][j];// go down
                    }
                }

            }
        }
        System.out.println(dp[N-1][N-1]);
    }
}