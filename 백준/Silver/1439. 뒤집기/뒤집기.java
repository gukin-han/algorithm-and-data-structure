import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        List<String> zeros= new ArrayList<>(Arrays.asList(S.split("1+")));
        List<String> ones= new ArrayList<>(Arrays.asList(S.split("0+")));
        zeros.removeAll(Arrays.asList(""));
        ones.removeAll(Arrays.asList(""));
 
        System.out.println(Math.min(zeros.size(), ones.size()));
 
    }
}