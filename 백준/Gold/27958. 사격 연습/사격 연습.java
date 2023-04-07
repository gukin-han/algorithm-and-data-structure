import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int maxScore = 0;
    static int[][] currentBoardOriginal;
    static int[][] initialBoardOriginal;
    static int[] bulletsOriginal;

    // pass all the possible cases into shooting game
    static void permutation(int[] arr, int depth, int n, int r, int[] out) {

        if (depth == r) {
            int score = shootingGame(out);
            maxScore = Math.max(score, maxScore);
            return;
        }

        for (int i = 0; i < n; i++) {
                out[depth] = arr[i];
                permutation(arr, depth + 1, n, r, out);
        }
    }

    // return the score of a given case of shooting
    static int shootingGame(int[] shootingCases) {
        int score = 0;

        int N = initialBoardOriginal.length;
        int[][] currentBoard = new int[N][N];
        int[][] initialBoard = new int[N][N];
        for (int i = 0; i < N; i++) {
            initialBoard[i] = currentBoardOriginal[i].clone();
            currentBoard[i] = currentBoardOriginal[i].clone();
        }

        // get the ith range and bullet
        for (int i = 0; i < shootingCases.length; i++) {
            int shootingRange = shootingCases[i];
            int bullet = bulletsOriginal[i];

            // find the target in the range
            int target = -1;
            for (int j = 0; j < currentBoard[shootingRange].length; j++) {
                if (currentBoard[shootingRange][j] != 0) {
                    target = j;
                    break;
                }
            }

            // get score
            if (target == -1) { // if it couldn't find it
                break;
            }

            if (currentBoard[shootingRange][target] >= 10) {
                score += initialBoard[shootingRange][target];
                currentBoard[shootingRange][target] = 0;
                initialBoard[shootingRange][target] = 0;
                continue;
            }

            if (currentBoard[shootingRange][target] >= 1 && currentBoard[shootingRange][target] <= 9) {
                if (currentBoard[shootingRange][target] > bullet) { // if target is still available
                    currentBoard[shootingRange][target] -= bullet;
                } else {
                    currentBoard[shootingRange][target] = 0; // target is down
                    score += initialBoard[shootingRange][target]; // get score
                    int subTarget = initialBoard[shootingRange][target] / 4;
                    initialBoard[shootingRange][target] = 0;

                    // create sub-targets up, down, right, left
                    // sub-target for up

                    if (subTarget == 0) {
                        continue;
                    }

                    if (shootingRange - 1 >= 0 && initialBoard[shootingRange - 1][target] == 0) {
                        initialBoard[shootingRange - 1][target] = subTarget;
                        currentBoard[shootingRange - 1][target] = subTarget;
                    }

                    // sub-target for down
                    if (shootingRange + 1 < currentBoard.length && initialBoard[shootingRange + 1][target] == 0) {
                        initialBoard[shootingRange + 1][target] = subTarget;
                        currentBoard[shootingRange + 1][target] = subTarget;
                    }

                    // sub-target for left
                    if (target - 1 >= 0 && initialBoard[shootingRange][target - 1] == 0) {
                        initialBoard[shootingRange][target - 1] = subTarget;
                        currentBoard[shootingRange][target - 1] = subTarget;
                    }

                    // sub-target for right
                    if (target + 1 < currentBoard[shootingRange].length && initialBoard[shootingRange][target + 1] == 0) {
                        initialBoard[shootingRange][target + 1] = subTarget;
                        currentBoard[shootingRange][target + 1] = subTarget;
                    }
                }
            }
        }

        return score;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int K = Integer.parseInt(reader.readLine());
        // create currentBoard and fill with the given inputs
        currentBoardOriginal = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < N; j++) {
                currentBoardOriginal[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // copied board to take note for the starting scores
        initialBoardOriginal = new int[N][N];
        for (int i = 0; i < N; i++) {
            initialBoardOriginal[i] = currentBoardOriginal[i].clone();
        }

        // get bullets data
        bulletsOriginal = new int[K];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < K; i++) {
            bulletsOriginal[i] = Integer.parseInt(st.nextToken());
        }

        reader.close();

        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i;
        }

        int[] out = new int[K];

        permutation(arr, 0, N, K, out);

        System.out.println(maxScore);
    }
}