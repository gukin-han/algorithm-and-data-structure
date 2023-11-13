class Solution {
    public String sortVowels(String s) {
        List<Character> chars = new ArrayList<>();
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        for (char c: s.toCharArray()) {
            if (vowels.contains(c)) chars.add(c);
        }

        Collections.sort(chars);

        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                result.append(chars.get(count++));
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}