import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int edgesNum = Integer.parseInt(reader.readLine());

        ArrayList[] edges = new ArrayList[edgesNum + 1];
        for (int i = 1; i < edgesNum + 1; i++) {
            edges[i] = new ArrayList<Integer>();
        }

        for (int i = 1; i < edgesNum; i++) {
            String[] input = reader.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            edges[x].add(y);
            edges[y].add(x);
        }
        reader.close();

        Stack stack = new Stack();
        int[] parents = new int[edgesNum + 1];

        stack.add(1);
        parents[1] = 1;
        while (!stack.isEmpty()) {
            int cur = (int) stack.pop();
            for (int i = 0; i < edges[cur].size(); i++) {
                int child = (int) edges[cur].get(i);
                if (parents[child] == 0) {
                    parents[child] = cur;
                    stack.add(child);
                }
            }
        }
        for (int i = 2; i < parents.length; i++) {
            System.out.println(parents[i]);
        }

    }

}