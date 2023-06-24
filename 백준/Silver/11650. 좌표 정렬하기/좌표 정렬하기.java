import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Point implements Comparable<Point> {
    public int x;
    public int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        TreeSet<Point> treeSet = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            treeSet.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        StringBuilder sb = new StringBuilder();
        Point point = treeSet.pollFirst();
        sb.append(String.valueOf(point.x + " " + point.y));
        while(!treeSet.isEmpty()) {
            point = treeSet.pollFirst();
            sb.append(String.valueOf("\n" + point.x + " " + point.y));
        }

        System.out.println(sb.toString());
    }
}