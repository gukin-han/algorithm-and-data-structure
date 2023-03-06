import java.util.ArrayList;

class Solution {
    
    private String[] givenWords= {"aya", "ye", "woo", "ma"};
    public int solution(String[] babbling) {
        int answer = 0;
        ArrayList<String> possibleOneWords = new ArrayList<String>();
        ArrayList<String> possibleTwoWords = new ArrayList<String>();
        ArrayList<String> possibleThreeWords = new ArrayList<String>();
        ArrayList<String> possibleFourWords = new ArrayList<String>();
        // use permutation
        // one element
        
        for (String word: givenWords) {
            possibleOneWords.add(word);
        }
        // two element
        for (String word: givenWords) {
            for (String oneWord: possibleOneWords) {
                if (!oneWord.contains(word)) {
                    possibleTwoWords.add(oneWord + word);
                }
            }
        }
        
        // three element
        for (String word: givenWords) {
            for (String twoWord: possibleTwoWords) {
                if (!twoWord.contains(word)) {
                    possibleThreeWords.add(twoWord + word);
                }
            }
        }
        // four element
        for (String word: givenWords) {
            for (String threeWord: possibleThreeWords) {
                if (!threeWord.contains(word)) {
                    possibleFourWords.add(threeWord + word);
                }
            }
        }
        
        for(String bab: babbling) {
            if (possibleOneWords.contains(bab)) {
                answer++;
            }
            
            if (possibleTwoWords.contains(bab)) {
                answer++;
            }
            
            if (possibleThreeWords.contains(bab)) {
                answer++;
            }
            
            if (possibleFourWords.contains(bab)) {
                answer++;
            }
        }
                
        return answer;
    }
    
}