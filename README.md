## 백준 풀이 Java 템플릿
```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[N];
        for (int i = 0; i < nums.length; i ++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
    }
}
```

## String
### 문자열이 알파벳인지
```java
char ch = 'a';

// approach 1
if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {}

// approach 2
if(Character.isAlphabetic(ch)) {}
```
