import java.util.Scanner;
// import java.util.StringBuilder;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        StringBuilder answer = new StringBuilder(a);
        for (int i = 1; i <= a; i++) {
            answer.append("*");
        }
        
        for (int i = 1; i <= b; i++) {
            System.out.println(answer.toString());
        }
    }
}