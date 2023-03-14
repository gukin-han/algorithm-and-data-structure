import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Deque deque = new ArrayDeque();
        for (int i = 1; i <= n; i++) {
            deque.addLast(i);
        }

        int turningCountSum = 0;
        for (int i = 1; i <= m; i++) {
            int temp = scanner.nextInt();
            int turningCount = 0;

            while ((int) deque.peek() != temp) {
                deque = goLeft(deque);
                turningCount++;
            }

            if (!deque.isEmpty()) {
                if (deque.size()/2 < turningCount) {
                    turningCount = deque.size() - turningCount;
                }
                deque.pollFirst();
                turningCountSum += turningCount;
            }
        }
        System.out.println(turningCountSum);
    }

    static Deque goLeft (Deque deque) {
        deque.addLast(deque.pollFirst());
        return deque;
    }

    static Deque goRight (Deque deque) {
        deque.addFirst(deque.pollLast());
        return deque;
    }
}