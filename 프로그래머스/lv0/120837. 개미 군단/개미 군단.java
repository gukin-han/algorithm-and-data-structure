class Solution {
    public int solution(int hp) {
        int numOfAnt = 0;
        int powerOfAnt1 = 5;
        int powerOfAnt2 = 3;
        int powerOfAnt3 = 1;
        
        if (hp >= 5) {
            numOfAnt += (hp / powerOfAnt1);
            hp = hp % powerOfAnt1;
        }
        
        if (hp >= 3) {
            numOfAnt += (hp / powerOfAnt2);
            hp = hp % powerOfAnt2;
        }
        
        if (hp >= 1) {
            numOfAnt += (hp / powerOfAnt3);
            hp = hp % powerOfAnt3;
        }
        
        int answer = numOfAnt;
        return answer;
    }
}