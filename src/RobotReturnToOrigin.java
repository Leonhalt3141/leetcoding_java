
class Solution657 {
    public boolean judgeCircle(String moves) {
        int vertical = 0;
        int horizontal = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'U') vertical += 1;
            else if (c == 'D') vertical -= 1;
            else if (c == 'L') horizontal -= 1;
            else if (c == 'R') horizontal += 1;
        }
        return (vertical == 0) && (horizontal == 0);
    }
}

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        Solution657 solution = new Solution657();

        System.out.println(solution.judgeCircle("UD"));

        System.out.println(solution.judgeCircle("LL"));
    }

}
