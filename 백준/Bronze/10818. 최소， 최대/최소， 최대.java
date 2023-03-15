import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.print(getMin(array));
        System.out.print(" "+ getMax(array));
    }

    static int getMax(int[] array) {
        int tempMax = Integer.MIN_VALUE;
        for (int x : array) {
            if (x > tempMax) {
                tempMax = x;
            }
        }
        return tempMax;
    }

    static int getMin(int[] array) {
        int tempMin = Integer.MAX_VALUE;
        for (int x : array) {
            if (x < tempMin) {
                tempMin = x;
            }
        }
        return tempMin;
    }
}