import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int targetSum = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        br.close();

        int higherPointer = 0;
        int lowerPointer = 0;
        int sumCnt = 0;
        int minRange = n + 1;
        int range = 0; // higherPointer - lowerPointer + 1;
        int sum = 0;
        while (lowerPointer < arr.length) {
            if (sum <= targetSum && higherPointer < arr.length) {
                sum += arr[higherPointer++];
            } else if (sum > targetSum || higherPointer == arr.length) {
                sum -= arr[lowerPointer++];
            }

            if (sum >= targetSum) {
                sumCnt++;
                range = higherPointer - lowerPointer;
                if (range < minRange) {
                    minRange = range;
                }
            }
        }
        if (minRange == n + 1) {
            minRange = 0;
        }

        System.out.println(minRange);
    }
}