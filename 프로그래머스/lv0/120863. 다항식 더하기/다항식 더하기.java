class Solution {
    public String solution(String polynomial) {
        // split the given String with " " -> [3x, 7, x]        
        // it would be easy to have the answer = ax + b
        // put them in the different array whether it has 'x' -> [3x, x], [7]
        // if it's only x -> return 1, if it's not return the charAt[0]
        int a = 0;
        int b = 0;

        String[] splitedPolynomial = polynomial.split(" ");

        for (String element: splitedPolynomial){
            if (element.contains("x")) {
                if (element.equals("x")) {
                    a++;
                } else {
                    a += (int) element.charAt(0) - 48;
                }
            } else if (!element.contains("+")) {
                b += (int) element.charAt(0) - 48;
            }
        }

        String answer = "";

        if (a == 0 && b == 0) {
            return "0";
        }
        
        if (a == 0 && b != 0) {
            return "" + b;
        }
        
        if (a == 1 && b == 0) {
            return "x";
        }
        
        if (a == 1 && b != 0) {
            return "x + " + b; // x + b
        }
        
        if (a > 1 && b == 0) {
            return "" + a + "x"; // ax
        }
        
        if (a > 1 && b != 0) {
            return "" + a + "x + " + b;
        }

        
        return answer;
    }
}