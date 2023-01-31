import java.util.Scanner;

class Main{
    public static void main(String[] args){

        // input
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // calculation
        int answer = num1 + num2;

        // print out
        System.out.println(answer);
    }
}