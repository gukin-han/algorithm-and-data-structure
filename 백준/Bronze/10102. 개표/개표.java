import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        solution(V, input);
    }
    public static void solution(int V, char[] chars) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int max = 0;
        char maxChar = ' ';
        for (char ch : map.keySet()) {
            if (max < map.get(ch)) {
                max = map.get(ch);
                maxChar = ch;
            }
        }

        if (max > V/2) System.out.println(maxChar);
        else System.out.println("Tie");
    }
}