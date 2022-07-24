import java.util.Arrays;

class Solution509 {

    int[] dp;
    public int fib(int n) {

        dp = new int[n + 1];
        calc_fib(n);
        return dp[n];
    }

    void calc_fib(int n) {
        if (n < 2) dp[n] = n;
        else {
            calc_fib(n - 1);
            calc_fib(n - 2);
            dp[n] = dp[n - 1] + dp[n - 2];
        }
    }

    public int fibA(int N) {
        if (N == 0) return 0;

        int[] dp = new int[N + 1];
        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[N];
    }
}

public class FibonacciNumber {
    public static void main(String[] args) {
        Solution509 solution = new Solution509();
        System.out.println(solution.fib(2));

        System.out.println(solution.fib(3));

        System.out.println(solution.fib(4));
    }
}
