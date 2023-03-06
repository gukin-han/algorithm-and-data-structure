class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        
        for (int[] line: lines) { // get Min Max of lines
            if (line[0] < xMin) {
                xMin = line[0];
            }
            
            if (line[1] > xMax) {
                xMax = line[1];
            }
        }
        
        double[] middlePoint = new double[Math.abs(xMax - xMin)];
        int[] middlePointCounter = new int[Math.abs(xMax - xMin)];
        
        int tempIndex = 0;
        for (int i = xMin; i < xMax; i++) {
            middlePoint[tempIndex++] = (double) i + 0.5;
        }
        
        tempIndex = 0;
        for (double point: middlePoint) {
            if (lines[0][0] <= point && lines[0][1] >= point) {
                middlePointCounter[tempIndex] += 1;
            }

            if (lines[1][0] <= point && lines[1][1] >= point) {
                middlePointCounter[tempIndex] += 1;
            }

            if (lines[2][0] <= point && lines[2][1] >= point) {
                middlePointCounter[tempIndex] += 1;
            }
            
            tempIndex++;
            
        }
        for (int counter :middlePointCounter) {
            if (counter >= 2) {
                answer++;
            }
        }
  
        
        return answer;
    }
}