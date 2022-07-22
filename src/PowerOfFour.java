
class Solution342 {
    public boolean isPowerOfFour(int n) {
        return check(n, 1);
    }

    boolean check(int n, long value) {
        if (value >= n) return n == value;

        return check(n, value * 4);
    }
}

public class PowerOfFour {
    public static void main(String[] args) {
        Solution342 solution = new Solution342();

        int n1 = 16;
        System.out.println(solution.isPowerOfFour(n1));

        int n2 = 5;
        System.out.println(solution.isPowerOfFour(n2));

        int n3 = 1;
        System.out.println(solution.isPowerOfFour(n3));
    }
}
