class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        int startNum = 1;
        while(true) {
            int[] tempArray = getContiguousNumArray(startNum, num);
            if (getSum(tempArray) == total) {
                return tempArray;
            } else if(getSum(tempArray) < total) {
                startNum += 1;
            } else if(getSum(tempArray) > total) {
                startNum -= 1;
            }
        }
    }
    
    int[] getContiguousNumArray(int start, int num) {
        int[] result = new int[num];
        for(int i = 0; i < num; i++) {
            result[i] = start + i;
        }
        return result;
    }
    
    int getSum(int[] numArray) {
        int sum = 0;
        for (int num: numArray) {
            sum += num;
        }
        return sum;
    }
}