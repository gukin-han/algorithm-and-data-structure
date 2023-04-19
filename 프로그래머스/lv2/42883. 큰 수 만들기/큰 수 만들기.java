import java.util.Stack;

class Solution {
    public static String solution(String number, int k) {
        String answer = "";
        

        String[] nums = number.split("");
        Stack<Integer> stack = new Stack<>();
        int answerSize = nums.length - k;

        stack.push(Integer.parseInt(nums[0]));
        int idx = 1;
        while (k != 0 && idx < nums.length) {
            if (!stack.isEmpty()) {
                int top = stack.peek();
                int next = Integer.parseInt(nums[idx]);

                if (top >= next) {
                    stack.push(next);
                    idx++;
                } else {
                    stack.pop();
                    k--;
                }
            } else {
                stack.push(Integer.parseInt(nums[idx]));
                idx++;
            }
        }

        for (int i = idx; i < nums.length; i++) {
            stack.push(Integer.parseInt(nums[i]));
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        answer = sb.reverse().toString();
        if (answer.length() > answerSize) {
            return answer.substring(0, answerSize);
        }

        return answer;
    }
}