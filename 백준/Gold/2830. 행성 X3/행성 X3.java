import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static final int DIGIT = 20;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int residentsNum = Integer.parseInt(reader.readLine());
        int[] oneCount = new int[DIGIT];
        for (int i = 0; i < residentsNum; i++) {
            int residentName = Integer.parseInt(reader.readLine());
            for (int j = 0; j < 20; j++) {
                if ((residentName & (1 << j)) > 0) oneCount[j]++;
            }
        }

        long answer = 0L;
        for (int i = 0; i < DIGIT; i++) {
            int zeroCount = residentsNum - oneCount[i];
            answer +=   (long) zeroCount * oneCount[i] * (1L << i) ;
        }
        System.out.println(answer);
    }
}