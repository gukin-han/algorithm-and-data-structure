import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        while (!str.contains("E-N-D")) {
            str += br.readLine();
        }
        String longestWord = "";
        int longestWordLength = Integer.MIN_VALUE;

        for(String s: str.toLowerCase().split("[^a-z-]")) {
            if (s.equals("E-N-D")) break;
            if (s.length() > longestWordLength) {
                longestWordLength = s.length();
                longestWord = s;
            }
        }
        System.out.println(longestWord.toLowerCase());
    }
}