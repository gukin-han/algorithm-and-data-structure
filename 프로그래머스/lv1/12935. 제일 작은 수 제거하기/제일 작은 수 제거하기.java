class Solution {
    int[] givenArr;

    Solution(){}

    Solution (int[] givenArr) {
        this.givenArr = givenArr;
    }

    public int[] solution (int[] arr) {
        Solution sol = new Solution(arr);
        return sol.findAndRemoveMinValueIn(sol.givenArr);
    }

    public int[] findAndRemoveMinValueIn (int[] arr) {
        return findMinValueIn(arr);
    }

    public int[] findMinValueIn(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int x: arr) {
            if(x < min) {
                min = x;
            }
        }
        return removeMinValueOf(min, arr);
    }

    public int[] removeMinValueOf(int min, int[] arr) {
        int[] MinRemovedArr = new int[arr.length - 1];
        int temp = 0;
        for (int x: arr) {
            if (x != min) {
                MinRemovedArr[temp++] = x;
            }
        }
        return MinRemovedArr;

    }
}