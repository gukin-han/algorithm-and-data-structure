import java.util.*;

class Main {
    public static void main(String[] args) {
        byte numOfStack = 4;
        Stack[] stacks = new Stack[numOfStack];
        for (int i = 0; i < numOfStack; i++) {
            stacks[i] = new Stack();
        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isValid = true;

        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            for (int j = 0; j < stacks.length; j++) {
                if (stacks[j].isEmpty()) {
                    stacks[j].push(element);
                    break;
                } else {
                    if ((int) stacks[j].peek() < element) {
                        stacks[j].push(element);
                        break;
                    } else {
                        if (j == 3) {
                            System.out.println("NO");
                            isValid = false;
                            break;
                        }
                    }
                }
            }
            if (!isValid) {
                break;
            }
        }

        if (isValid) {
            System.out.println("YES");
        }


    }
}