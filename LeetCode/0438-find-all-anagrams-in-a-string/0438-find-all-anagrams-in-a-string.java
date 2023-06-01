class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        Map<Character, Integer> mapP = new HashMap<>();
        Map<Character, Integer> mapS = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        
        if (s.length() < p.length()) return answer;

        
        for (int i=0; i<p.length();i++) {
            char ch = p.charAt(i);
            mapP.put(ch, mapP.getOrDefault(ch, 0) + 1);
        }
        
        for (int i=0; i<p.length() - 1; i++) {
            char ch = s.charAt(i);
            mapS.put(ch, mapS.getOrDefault(ch, 0) + 1);
        }
        
        for (int rightP = p.length() - 1; rightP < s.length(); rightP++) {
            char newCh = s.charAt(rightP);
            int leftP = rightP + 1 - p.length();
            mapS.put(newCh, mapS.getOrDefault(newCh, 0) + 1);
            System.out.println(mapS + " " + mapP);
            if (mapS.equals(mapP)) {
                answer.add(leftP);
            }
            char oldCh = s.charAt(leftP);

            mapS.put(oldCh, mapS.getOrDefault(oldCh, 0) - 1);
            if (mapS.get(oldCh) == 0) mapS.remove(oldCh);
            
        }
        
        return answer;
    }
}