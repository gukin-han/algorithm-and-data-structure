class Solution {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while(left < right) {
            if (!((chars[left] >= 'a' && chars[left] <= 'z') || (chars[left] >= 'A' && chars[left] <= 'Z'))) {
                left++;
            }
            else if (!((chars[right] >= 'a' && chars[right] <= 'z') || (chars[right] >= 'A' && chars[right] <= 'Z'))){
                right--;
            } else {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
            }
        }
        
        return String.valueOf(chars);
    }
}