import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int[] output = new int[m];

        permutation(arr, visited, 0, m, output);

    }

    public static void permutation(int[] arr, boolean[] visited, int depth, int m, int[] output) {
        if (depth == m) {
            for (int i = 0; i < output.length; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if(!visited[i]){
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, visited, depth + 1, m, output);
                visited[i] = false;
            }
        }
    }
}