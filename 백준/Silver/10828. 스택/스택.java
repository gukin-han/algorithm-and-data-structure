import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Stack {
    int[] values;
    int size;
    int topPointer;
    Stack (int size) {
        this.size = size;
        this.values = new int[size];
        this.topPointer = 0;
    }

    public void push(int item) {
        this.values[this.topPointer] = item;
        this.topPointer++;
    }

    public void pop() {
        if (this.topPointer == 0) {
            System.out.println("-1");
        } else {
            System.out.println(this.values[this.topPointer - 1]);
            this.topPointer--;
        }
    }

    public void top() {
        if (this.topPointer == 0) {
            System.out.println("-1");
        } else {
            System.out.println(this.values[this.topPointer - 1]);
        }
    }

    public void getSize() {
        System.out.println(this.topPointer);
    }

    public boolean isEmpty() {
        if (this.topPointer == 0) {
            System.out.println("1");
            return true;
        } else {
            System.out.println("0");
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Stack stack = new Stack(n);
        for (int i = 0; i < n; i++) {
            String instruction = reader.readLine().strip();
            boolean pushFlag = false;

            switch (instruction) {
                case "pop": stack.pop(); break;
                case "top": stack.top(); break;
                case "size": stack.getSize(); break;
                case "empty": stack.isEmpty(); break;
                default: pushFlag = true;
            }
            if (pushFlag) {
                String[] newInstruction = instruction.split(" ");
                stack.push(Integer.parseInt(newInstruction[1]));
            }

        }
    }
}