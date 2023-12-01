class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//         // Approach 1: Concatenate and Compare
//         StringBuilder sb1 = new StringBuilder();
//         StringBuilder sb2 = new StringBuilder();

//         for (String w: word1) {
//             sb1.append(w);
//         }

//         for(String w: word2) {
//             sb2.append(w);
//         }

//         return sb1.toString().equals(sb2.toString());
        
        // Approach 2: Two pointers
        int pString1 = 0;
        int pString2 = 0;
        int pChar1 = 0;
        int pChar2 = 0;
        int total1 = 0;
        int total2 = 0;
        
        while (pString1 < word1.length && pString2 < word2.length) {
            String s1 = word1[pString1];
            String s2 = word2[pString2];
            char c1 = s1.charAt(pChar1);
            char c2 = s2.charAt(pChar2);
            
            if (c1 != c2) return false;
            pChar1++;
            pChar2++;
            
            if (pChar1 >= s1.length()) {
                pChar1 = 0;
                pString1++;
            }
            
            if (pChar2 >= s2.length()) {
                pChar2 = 0;
                pString2++;
            }
            
            
        }
        return pString1 >= word1.length && pString2 >= word2.length;
        
        // return true;

    }


}