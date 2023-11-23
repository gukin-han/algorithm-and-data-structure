class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int size = r[i] - l[i];
            int[] arr = new int[size + 1];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = nums[l[i] + j];
            }
            Arrays.sort(arr);
            int lastIdx = arr.length - 1;
            int difference = arr[1] - arr[0];
            boolean found = false;
            for (int j = 0 ; j < arr.length - 1; j++) {
                if (arr[j + 1] - arr[j] != difference) {
                    result.add(false);
                    found = true;
                    break;
                }
            }
            if (!found) result.add(true);
        }

        return result;
    }
}