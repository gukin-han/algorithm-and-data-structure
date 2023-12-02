class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] counter = new int[(int) 'z' + 1];
        for (char c: chars.toCharArray()) {
            counter[(int) c]++;
        }

        int result = 0;        
        for (String word: words) {
            int[] counterDup = Arrays.copyOf(counter, counter.length);
            boolean isGood = true;
            for (char c: word.toCharArray()) {
                counterDup[(int) c]--;
                if (counterDup[(int) c] < 0) {
                    isGood = false;
                    break;
                }
            }
            if (isGood) {
                result += word.length();
            }
        }

        return result;
    }
}