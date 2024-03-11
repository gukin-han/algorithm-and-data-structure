class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c: s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();

        for (char c: order.toCharArray()) {
            if (count.containsKey(c)) {
                for (int i = 0; i < count.get(c); i++) {
                    sb.append(c);
                }
                count.remove(c);
            }
        }

        for (Character c: count.keySet()) {
            for (int i = 0; i < count.get(c); i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}