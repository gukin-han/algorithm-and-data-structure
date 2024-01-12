class Solution {
    private char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    public boolean halvesAreAlike(String s) {
        boolean[] isVowel = new boolean[(int) 'z' + 1];
        for (char v: vowels) {
            isVowel[(int) v] = true;
        }

        int aCount = 0;
        int bCount = 0;

        for (int i = 0; i < s.length()/2; i++) {
            if (isVowel[(int) s.charAt(i)]) {
                aCount++;
            }
        }

        for (int i = s.length()/2; i < s.length(); i++) {
            if (isVowel[(int) s.charAt(i)]) {
                bCount++;
            }
        }

        return aCount == bCount;
    }
}