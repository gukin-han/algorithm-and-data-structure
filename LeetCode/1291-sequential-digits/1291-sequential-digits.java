class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> result = new ArrayList<>();
        int digitFrom = String.valueOf(low).length();
        int digitTo = String.valueOf(high).length();
        String sample = "123456789";
        
        for (int length = digitFrom; length <= digitTo; length++) {
            for (int i = 0; i <= 8; i++) {
                if (i + length > 9) break;
                int sub = Integer.parseInt(sample.substring(i, i + length));
                if (sub >= low && sub <= high) result.add(sub);
            }
        }
        
        return result;
    }
}