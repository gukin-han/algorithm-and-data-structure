import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] memo = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        memo[0] = 1;

        for (int i = 1; i < memo.length; i++) {
            int cur = arr[i];
            int maxLength = 0;
            for (int j = 0; j <= i - 1; j++) {
                int pre = arr[j];
                int preLength = memo[j];
                if (cur > pre && maxLength < preLength) {
                    maxLength = preLength;
                }
            }
            memo[i] = maxLength + 1;
        }

        int max = 0;
        for (int i = 0; i < memo.length; i++) {
            max = Math.max(max, memo[i]);
        }
        System.out.println(max);

        Stack<Integer> stack = new Stack<>();
        for (int i = memo.length - 1; i >= 0; i--) {
            if (max == memo[i]) {
                stack.add(arr[i]);
                max--;
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
