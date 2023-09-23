class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        if (words.length == 1) return 1;
        for (String word: words) {
            System.out.print(word + " ");
        }

        int predecessor = 0;
        int result = 0;
        int dp[] = new int[words.length];
        dp[0] = 1;
        for (int i = 1; i < words.length; i++) {
            String wordB = words[i];
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                String wordA = words[j];
                if(isPredecessor(wordA, wordB)) dp[i] = Math.max(dp[j] + 1, dp[i]) ;
                result = Math.max(dp[i], result);
                // System.out.print(dp[i] + " ");
            }
            // System.out.println(" ");
        }

        return result;
    }

    private boolean isPredecessor(String wordA, String wordB) {

        int refA = 0;
        int refB = 0;
        if (wordA.length() != wordB.length() - 1) return false;

        while (refA < wordA.length() && refB < wordB.length()) {
            if(wordA.charAt(refA) == wordB.charAt(refB)) refA++;
            refB++;
        }
        return refA == wordA.length();
    }
}