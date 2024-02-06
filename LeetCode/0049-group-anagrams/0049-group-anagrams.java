class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> answer = new HashMap<>();
        String[] sortedStrs = new String[strs.length];

        for (String word: strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            answer.putIfAbsent(sortedWord, new ArrayList<>());
            answer.get(sortedWord).add(word);
        }


        return new ArrayList<>(answer.values());
    }
}