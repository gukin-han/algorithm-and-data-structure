import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] operator = new int[4];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        int depth = 1;
        dfs(arr, operator, depth, n, arr[0]);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int[] arr, int[] operator, int depth, int n, int result) {

        if (depth == n) {
            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] != 0) {
                operator[i]--;
                switch(i) {
                    case 0: dfs(arr, operator, depth+1, n, result + arr[depth]); break;
                    case 1: dfs(arr, operator, depth+1, n, result - arr[depth]); break;
                    case 2: dfs(arr, operator, depth+1, n, result * arr[depth]); break;
                    case 3: dfs(arr, operator, depth+1, n, result / arr[depth]); break;
                }
                operator[i]++;
            }
        }
    }
}