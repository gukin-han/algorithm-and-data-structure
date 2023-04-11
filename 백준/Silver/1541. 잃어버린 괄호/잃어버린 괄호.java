import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        String[] withoutMinus = S.split("-");
        int[] sum = new int[withoutMinus.length];
        for (int i = 0; i < withoutMinus.length; i++) {
            String[] temp = withoutMinus[i].split("[+]");
            int tempSum = 0;
            for (int j = 0; j < temp.length; j++) {
                tempSum += Integer.parseInt(temp[j]);
            }
            sum[i] = tempSum;
        }

        int result = sum[0];
        for (int i = 1; i < sum.length; i++) {
            result -= sum[i];
        }
        System.out.println(result);
    }
}