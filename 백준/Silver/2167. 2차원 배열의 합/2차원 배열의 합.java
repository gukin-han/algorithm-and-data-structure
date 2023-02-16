import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class Main{
    static int n;
    static int m;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);

        ArrayList<Integer[]> givenList = new ArrayList<Integer[]>();
        for (int i = 0; i < n; i++) {
            line = bf.readLine().split(" ");
            Integer[] tempArray = new Integer[m];
            for (int j = 0; j < m; j++) {
                tempArray[j] = Integer.parseInt(line[j]);
            }
            givenList.add(tempArray);
        }

        k = Integer.parseInt(bf.readLine());
        for (int a = 0; a < k; a++) {
            line = bf.readLine().split(" ");
            int i = Integer.parseInt(line[0]) - 1;
            int j = Integer.parseInt(line[1]) - 1;
            int x = Integer.parseInt(line[2]) - 1;
            int y = Integer.parseInt(line[3]) - 1;
            calSum(i, j, x, y, givenList);
        }
    }
    static void calSum(int i, int j, int x, int y, ArrayList<Integer[]> list) {
        int sum = 0;
        for (int l = i; l <= x; l++) {
            for (int o = j; o <= y; o++) {
                sum += list.get(l)[o];
            }
        }
        System.out.println(sum);
    }
}