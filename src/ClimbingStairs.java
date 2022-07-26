
class Solution70 {

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];

    }


}

public class ClimbingStairs {
    public static void main(String[] args) {
        Solution70 solution = new Solution70();

        int n1 = 7;
        System.out.println(solution.climbStairs(n1));

        System.out.println(solution.climbStairs(2));

        System.out.println(solution.climbStairs(3));

        System.out.println(solution.climbStairs(4));

        System.out.println(solution.climbStairs(5));

        System.out.println(solution.climbStairs(44));
    }
}
