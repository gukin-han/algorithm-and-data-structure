import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] strings = str.split("[^0-9]");
        long answer = 0;
        for (String string: strings) {
            if (!string.isBlank()) {
                answer += Integer.parseInt(string);
            }
        }
        System.out.println(answer);
    }
}