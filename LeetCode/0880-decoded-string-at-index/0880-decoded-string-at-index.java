class Solution {
    public String decodeAtIndex(String s, int k) {
        long totalLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) totalLength *= (int) c - '0';
            else totalLength++;
        }
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                totalLength /= (int) c - '0';
                k %= totalLength;
            } else {
                if (k == totalLength || k == 0) return "" + s.charAt(i);
               totalLength--; 
            } 
            
            
        }
        
        return "";
        
    }
}