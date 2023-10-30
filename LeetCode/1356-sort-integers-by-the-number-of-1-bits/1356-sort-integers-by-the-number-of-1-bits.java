class Solution {
    public int[] sortByBits(int[] arr) {
        List<NewNum> arrNewNum = new ArrayList<>();
        for (int e: arr) {
            arrNewNum.add(new NewNum(e));
        }

        Collections.sort(arrNewNum, (a, b) -> {
            if (a.numOfOne != b.numOfOne) return a.numOfOne - b.numOfOne;
            else return a.num - b.num;
        });

        int[] answer = new int[arr.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrNewNum.get(i).num;
        }

        return answer;
        
    }

    private class NewNum {
        int num;
        int numOfOne = 0;

        public NewNum (int num) {
            this.num = num;

            while(num >= 1) {
                if (num == 1) {
                    numOfOne++;
                    break;
                }
                if (num % 2 == 1) numOfOne++;
                num /= 2;
            }
        }
    }
}