
class Solution551 {
    public boolean checkRecord(String s) {
        int lateCount = 0;
        int absentCount = 0;

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                absentCount++;
                lateCount = 0;
                if (absentCount == 2) return false;
            } else if (c == 'L') {
                lateCount++;
                if (lateCount == 3) return false;
            } else {
                lateCount = 0;
            }
        }
        return true;
    }
}

public class StudentAttendanceRecord1 {

    public static void main(String[] args) {
        Solution551 solution = new Solution551();

        System.out.println(solution.checkRecord("PPALLP"));
        System.out.println(solution.checkRecord("PPALLL"));
    }
}
