//try-2023-02-22-wed-java original
class Solution {
    public String[] solution(String[] quizs) {
        String[] answer = new String[quizs.length];
        int index = 0;
        for (String quiz: quizs) {
            
            String[] splitQuiz = quiz.split(" ");
            int num1 = Integer.parseInt(splitQuiz[0]);
            int num2 = Integer.parseInt(splitQuiz[2]);
            int givenAnswer = Integer.parseInt(splitQuiz[4]);
            int answerToCompare = 0;
            
            if (splitQuiz[1].equals("-")) {
                answerToCompare = num1 - num2;
            } else {
                answerToCompare = num1 + num2;
            }
            
            if (answerToCompare == givenAnswer) {
                answer[index++] = "O";
            } else {
                answer[index++] = "X";
            }
        }
        return answer;
    }
}