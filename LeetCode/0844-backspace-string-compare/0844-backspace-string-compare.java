class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackForS = new Stack<>();
        Stack<Character> stackForT = new Stack<>();

        doBackspace(stackForS, s);
        doBackspace(stackForT, t);
        return compare(stackForS, stackForT);

    }

    private void doBackspace(Stack<Character> stack, String string) {
        for (char c: string.toCharArray()) {
            if (c == '#' && !stack.isEmpty()) stack.pop();
            else if(c == '#') continue;
            else stack.add(c);
        }
    }

    private boolean compare(Stack<Character> stackS, Stack<Character> stackT) {
        if (stackS.size() != stackT.size()) return false;
        while(!stackS.isEmpty()) {
            if (stackS.pop() != stackT.pop()) return false;
        }
        return true;
    }
}