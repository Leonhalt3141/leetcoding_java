
class Solution29 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        long dd = Math.abs((long) dividend);
        long dv = Math.abs((long) divisor);

        int ans = 0;
        while (dv <= dd) {
            long temp = dv, count = 1;
            while (temp <= dd - temp) {
                temp = temp * 2;
                count = count * 2;
            }
            ans += count;
            dd -= temp;
        }

        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) return -ans;
        return ans;
    }
}

public class DivideTwoIntegers {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(n << 1);
    }
}
