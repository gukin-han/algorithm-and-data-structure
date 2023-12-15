class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> path: paths) {
            map.put(path.get(0), path.get(1));
        }
        
        String cur = paths.get(0).get(1);
        boolean hasNext = true;
        while (hasNext) {
            if (!map.containsKey(cur)) hasNext = false;
            else {
                cur = map.get(cur);
            }
        }
        
        return cur;
    }
}