import java.util.Arrays;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        // create array with availableFood num
        int[] availableFood = new int[food.length];
        for (int i = 0; i < availableFood.length; i++) {
            availableFood[i] = (food[i] / 2);
        }
        
        // for loop to fill up the half of answer array
        int foodCount = 0;
        for (int i = 1; i < availableFood.length; i++) {
            foodCount = availableFood[i];
            while (foodCount > 0) {
                answer += i;
                foodCount--;
            }
        }
        
        // fill up for the Water part in the middle;
        answer += 0;
        
        // for loop to fill up the other side of half of answer array
        foodCount = 0;
        for (int i = availableFood.length - 1; i > 0; i--) {
            foodCount = availableFood[i];
            while (foodCount > 0) {
                answer += i;
                foodCount--;
            }
        }
        return answer;
    }
}