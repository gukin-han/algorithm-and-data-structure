import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 회전 초밥 벨트에 놓인 접시의 수
        int d = Integer.parseInt(st.nextToken()); // 초밥의 가짓수
        int k = Integer.parseInt(st.nextToken()); // 연속해서 먹는 접시의 수
        int c = Integer.parseInt(st.nextToken()); // 쿠폰 번호

        int[] dishes = new int[N];
        for (int i = 0; i < dishes.length; i++) {
            dishes[i] = Integer.parseInt(br.readLine());
        }

        solution(N, d, k, c, dishes);
    }
    public static void solution(int N, int d, int k, int c, int[] dishes) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            int dish = dishes[i % N];
            map.put(dish, map.getOrDefault(dish, 0) + 1);
        }
        int max = map.size();

        for (int leftP = 0; leftP < dishes.length; leftP++) {
            int dishNum = 0;
            int rightP = (leftP + k) % N ;
            map.put(dishes[rightP], map.getOrDefault(dishes[rightP], 0) + 1);
            map.put(dishes[leftP], map.get(dishes[leftP]) - 1);
            if (map.get(dishes[leftP]) == 0) {
                map.remove(dishes[leftP]);
            }
            dishNum = map.size();
            if (!map.containsKey(c)) dishNum++;
            max = Math.max(dishNum, max);
        }

        System.out.println(max);
    }
}