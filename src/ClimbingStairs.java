
class Solution70 {

    int[] dp = new int[46];
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        } else if (dp[n] != 0) {
            return dp[n];
        } else {
            dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
            return dp[n];
        }
    }
}

public class ClimbingStairs {
    public static void main(String[] args) {
        Solution70 solution = new Solution70();

        int n1 = 7;
        System.out.println(solution.climbStairs(n1));
    }
}
