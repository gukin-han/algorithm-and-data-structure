class Solution {
    public boolean winnerOfGame(String colors) {
        int aCount = 0;
        int bCount = 0;
        
        for (int i = 2; i < colors.length(); i++) {
            char first = colors.charAt(i-2);
            char second = colors.charAt(i-1);
            char third = colors.charAt(i);
            
            if (first == 'A' && second == 'A' && third =='A') aCount++;
            if (first == 'B' && second == 'B' && third =='B') bCount++;
        }
        
        return aCount>bCount;
        
        
//         while(true) {
//             if (colors.contains("AAA")) colors = colors.replaceFirst("AAA", "AA");
//             else return false;
            
//             if (colors.contains("BBB")) colors = colors.replaceFirst("BBB", "BB");
//             else return true;
//         }
    }
}