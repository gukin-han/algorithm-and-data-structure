import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate targetDate = LocalDate.of(2016,a,b);
        java.time.DayOfWeek dayOfWeek = targetDate.getDayOfWeek();
        dayOfWeek.toString(); // WEDNESDAY

        return dayOfWeek.toString().substring(0,3);
    }
}