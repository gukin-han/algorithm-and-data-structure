import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        String[] stringArray = reader.readLine().split(" ");
        String matchNum = reader.readLine();

        int output = 0;
        for (String str : stringArray) {
            if (matchNum.equals(str)) {
                output++;
            }
        }

        System.out.println(output);
    }
}