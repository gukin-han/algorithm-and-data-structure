class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1) ;
        }
        
        for (Character ch: t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1) ;
            if (map.get(ch) < 0) return false;
        }
        
        return true;
    }
}