class Solution {
    public int[] solution(String s) {
        if (s == "1") return new int[]{0, 0};
        int removedZerosCount = 0;
        int binaryTrasformCount = 0;
        int count = 4;
        while (!s.equals("1")) {
            binaryTrasformCount++;
            
            int total = s.length();
            int c = 0;
            for (char ch: s.toCharArray()) {
                if (ch == '1') c++;
            }
            removedZerosCount += total - c;
            
            s = cToBinaryString(c);
        }
        
        return new int[]{binaryTrasformCount, removedZerosCount};
    }
    
    private String cToBinaryString (int c) {
        String next = "";
            while (c != 0) {
                if (c % 2 == 0) next = "0" + next;
                else next = "1" + next;
                c /= 2;
        }
        
        return next;
    }
}