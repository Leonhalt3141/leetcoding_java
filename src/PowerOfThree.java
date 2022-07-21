
class Solution326 {
    public boolean isPowerOfThree(int n) {
        return check(n, 1);
    }

    boolean check(int n, long value) {
        if (value >= n) return n == value;

        return check(n, value * 3);
    }
}

public class PowerOfThree {
    public static void main(String[] args) {
        Solution326 solution = new Solution326();

        int n1 = 27;
        System.out.println(solution.isPowerOfThree(n1));

        int n2 = 8;
        System.out.println(solution.isPowerOfThree(n2));

        int n3 = 9;
        System.out.println(solution.isPowerOfThree(n3));

        int n4 = 45;
        System.out.println(solution.isPowerOfThree(n4));

        int n5 = 1;
        System.out.println(solution.isPowerOfThree(n5));

        int n6 = 19684;
        System.out.println(solution.isPowerOfThree(n6));
    }
}
