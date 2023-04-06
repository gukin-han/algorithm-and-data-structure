import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void permutation(int[] arr, int depth, int n, int r, boolean[] visited, int[] out) {
        if (depth == r) {
            for (int x : out) {
                System.out.print(x + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                out[depth] = arr[i];
                visited[i] = true;
                permutation(arr, depth + 1, n, r, visited, out);
                visited[i] = false;
            }
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = n;
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i-1] = i;
        }
        boolean[] visited = new boolean[n];
        int[] out = new int[n];

        permutation(arr, 0, n, r, visited, out);
    }
}