import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int[] tempArray = new int[n];
        int tempIndex = 0;
        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());
            }
            tempArray[tempIndex++] = (int) queue.poll();
        }

        String answer = "<" + tempArray[0];

        for (int i = 1; i < tempArray.length; i++) {
            answer += (", " + tempArray[i]);
        }

        System.out.println(answer + ">");
    }
}