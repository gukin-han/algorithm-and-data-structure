class Solution {
    public int solution(String[] spell, String[] dic) {
        // filter num of cha of word in dic == length of char in spell array. 
        // => use all alphabets only once
        // use contain method to check if it contains every given alphabets
        int answer = 2;
        
        
        for (String word: dic) {
            if (isTheSameLength(spell, word)) {
                boolean containAllFlag = true;
                for (String uniStr: spell) {
                    if (!word.contains(uniStr)) {
                        containAllFlag = false;
                        break;
                    }  
                }
                if (containAllFlag) {
                        return 1;
                }
            }else{
                boolean containAllFlag = true;
                for (String uniStr: spell) {
                    if (!word.contains(uniStr)) {
                        containAllFlag = false;
                        break;
                    }  
                }
                if (containAllFlag) {
                        return 1;
                }
            }
        }
        return answer;
    }
    boolean isTheSameLength(String[] spell, String word) {
        if (spell.length == word.length()) {
            return true;
        } else {
            return false;
        }
    }
}