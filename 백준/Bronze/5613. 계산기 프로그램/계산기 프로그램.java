import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Queue<String> queue = new LinkedList<>();

        while (true) {
            String input = reader.readLine();
            if (input.equals("=")) {
                break;
            }
            queue.add(input);
        }

        int answer = Integer.parseInt(queue.poll());
        while (!queue.isEmpty()) {
            String operator = queue.poll();
            switch (operator) {
                case "+":
                    answer += Integer.parseInt(queue.poll());
                    break;
                case "-":
                    answer -= Integer.parseInt(queue.poll());
                    break;
                case "*":
                    answer *= Integer.parseInt(queue.poll());
                    break;
                case "/":
                    answer /= Integer.parseInt(queue.poll());
                    break;
            }
        }

        System.out.println(answer);
    }

}
