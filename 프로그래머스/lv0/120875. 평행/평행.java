import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        // use cartesian coordinate
        // create function to get a vector out of two points
        // normalize them to have a tail at origin (0, 0) and magnitude of 1
        int answer = 0;
        if (isParallelFromFourPoints(dots[0], dots[1], dots[2], dots[3])) {
            return 1;
        }
    
        return answer;
    }
    
    double[] twoPointsToAVector (int[] point1, int[] point2) {
        double[] vector = new double[2];
        vector[0] = (double) point1[0] - point2[0];
        vector[1] = (double) point1[1] - point2[1];
        return vector;
    }
    
    double[] vectorNormalization (double[] vector) {
        double[] normVector = new double[2];
        double vectorLength = Math.sqrt(vector[0] * vector[0] + vector[1] * vector[1]);
        normVector[0] = vector[0] / vectorLength;
        return normVector;
    }
    
    boolean isParallel (double[] normVector1, double[] normVector2) {
        if(normVector1[0] == normVector2[0] && normVector1[1] == normVector2[1]) {
            return true;
        }
        
        if(-normVector1[0] == normVector2[0] && -normVector1[1] == normVector2[1]) {
            return true;
        }
        
        return false;
    }
    
    boolean isParallelFromFourPoints (int[] point1, int[] point2, int[] point3, int[] point4) {
        double[] vector1 = vectorNormalization(twoPointsToAVector(point1, point2));
        double[] vector2 = vectorNormalization(twoPointsToAVector(point3, point4));
        return isParallel(vector1, vector2);
    }
}