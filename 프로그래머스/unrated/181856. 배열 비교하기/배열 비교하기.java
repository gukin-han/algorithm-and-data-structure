class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int lenArr1 = arr1.length;
        int lenArr2 = arr2.length;
        if (lenArr1 != lenArr2) return (lenArr1 > lenArr2)? 1: -1;
        return (getSum(arr1) > getSum(arr2))? 1 : (getSum(arr1) == getSum(arr2))? 0:-1;
    }
    
    private int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}