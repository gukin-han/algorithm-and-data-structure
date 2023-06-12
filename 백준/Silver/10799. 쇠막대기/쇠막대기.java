import java.io.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
    public static void solution(String input) {
        Stack<Character> stack = new Stack<>();
        int ret = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch == '(') stack.push(ch);
            else {
                if (input.charAt(i-1) == '(') {
                    stack.pop();
                    ret += stack.size();
                } else {
                    stack.pop();
                    ret++;
                }
            }
        }
        System.out.println(ret);
    }
}