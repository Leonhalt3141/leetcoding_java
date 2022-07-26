
class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        int[] dp = new int[size + 1];

        dp[size - 1] = cost[size - 1];
        dp[size] = 0;

        for (int i = size - 2; i >= 0; i--) {

            dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
        }
        return Math.min(dp[0], dp[1]);

    }
}

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        Solution746 solution = new Solution746();

        int[] cost1 = new int[]{10, 15, 20};
        System.out.println(solution.minCostClimbingStairs(cost1));

        int[] cost2 = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(solution.minCostClimbingStairs(cost2));
    }
}
