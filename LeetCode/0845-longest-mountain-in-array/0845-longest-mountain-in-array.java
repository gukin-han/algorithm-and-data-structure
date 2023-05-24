class Solution {
    public int longestMountain(int[] arr) {
        int count = 1;
        boolean upward = false;
        boolean downward = false;
        int longest = 0;
        
        for (int i = 1; i < arr.length; i++) {
            int prev = arr[i - 1];
            int cur = arr[i];
            if (prev < cur) { // climing 
                if(upward && !downward) {  
                    count++;
                } else if (upward && downward) {
                    longest = Math.max(count, longest);
                    count = 2;
                    downward = false;
                } else if (!upward && !downward) {
                    count = 2;
                    upward = true;
                }
            } else if (prev > cur) { //decliming
                if (upward && downward) {
                    count++;
                } else if (upward && !downward) {
                    count++;
                    downward = true;
                }
            } else if (prev == cur){ // flat
                if (downward && upward) {
                    longest = Math.max(count, longest);
                }
                count = 0;
                downward = false;
                upward = false;
            }
        }
        if (downward) {
            longest = Math.max(count, longest);

        }

        return longest == 1 ? 0: longest;
    }
}