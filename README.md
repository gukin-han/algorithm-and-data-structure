## String
### 문자열이 알파벳인지
```java
char ch = 'a';

// approach 1
if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {}

// approach 2
if(Character.isAlphabetic(ch)) {}
```
