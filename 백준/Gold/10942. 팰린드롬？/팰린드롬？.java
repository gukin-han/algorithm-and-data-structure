import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[N + 1];
        for(int i = 1; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            sb.append(isPalindrome(numbers, left, right) ? 1 : 0);
            if (i != M-1) {
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());

    }
    private static boolean isPalindrome(int[] numbers, int left, int right) {

        while(left <= right) {
            int leftNumber = numbers[left];
            int rightNumber = numbers[right];

            if(leftNumber != rightNumber) return false;
            left++;
            right--;
        }

        return true;
    }
}