import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String S = reader.readLine();
        String reversedS = reverseString(S);

        if (S.equals(reversedS)) {
            System.out.println(S.length());
            return;
        }

        for (int i = 1; i < S.length(); i++) {
            String newS = S + reversedS.substring(S.length() - i);
            if (newS.equals(reverseString(newS))) {
                System.out.println(newS.length());
                return;
            }
        }


    }

    public static String reverseString(String S) {
        return new StringBuilder(S).reverse().toString();
    }
}