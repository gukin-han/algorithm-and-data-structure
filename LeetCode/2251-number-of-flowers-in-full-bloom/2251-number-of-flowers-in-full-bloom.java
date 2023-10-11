class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];
        
        for (int i = 0 ; i < flowers.length; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int[] answer = new int[people.length];
        
        for (int i = 0; i < people.length;i++) {
            int p = people[i];
            int started = upperBound(start, p);
            int ended = lowerBound(end, p);
            
            answer[i] = started - ended;
        }
    
        
        return answer;
    }
    
    public int upperBound(int[] array, int target) {
        int low = 0;
        int high = array.length;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] <= target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
    
    public int lowerBound(int[] array, int target) {
        int low = 0;
        int high = array.length;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] < target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}