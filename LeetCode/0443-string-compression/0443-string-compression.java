class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) return chars.length;
        
        char prev = ' ';
        int count = 1;
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == prev) {
                count++;
            } else {
                if (count >= 2) {
                    s += count;
                }
                s += ch;
                prev = ch;
                count = 1;
            }
            if (i == chars.length - 1 && count >= 2) {
                s += count;
            }
            
        }
        
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}