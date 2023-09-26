class Solution {
    public String removeDuplicateLetters(String s) {

        int[] countArr = new int[(int) 'z' + 1];
        boolean[] visited = new boolean[(int) 'z' + 1];
        Stack<Integer> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            countArr[(int) c]++;
        }

        int count = 0;
        while (count < s.length()) {
            char c = s.charAt(count);
            if (visited[(int) c]) {
                count++;
                countArr[(int) c]--;
                continue;

            }

            if (stack.isEmpty()) {
                stack.push((int) c);
                visited[(int) c] = true;
                countArr[(int) c]--;
                count++;
                continue;
            }

            if (stack.peek() < (int) c) { // increasing
                stack.push((int) c);
                visited[(int) c] = true;
                countArr[(int) c]--;
                count++;

            } else { // decreasing
                if (countArr[stack.peek()] == 0) { // never occurs in the future
                    stack.push((int) c);
                    visited[(int) c] = true;
                    countArr[(int) c]--;
                    count++;
                } else {
                    int prev = stack.pop();
                    visited[prev] = false;
                }
            }


        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append( (char) (int) stack.pop());
        }

        return sb.reverse().toString();
    }
}