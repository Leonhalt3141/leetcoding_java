import java.util.List;

class Solution231 {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        int x = (int) (Math.log(n) / Math.log(2));

        return n == (int) Math.pow(2, x);

    }

    public boolean isPowerTwoA(int n) {
        return (n > 0) && (n & (n - 1)) == 0;
    }
}

public class PowerOfTwo {
    public static void main(String[] args) {
        Solution231 solution = new Solution231();

        int n1 = 1;
        System.out.println(solution.isPowerOfTwo(n1));

        int n2 = 16;
        System.out.println(solution.isPowerOfTwo(n2));

        int n3 = 3;
        System.out.println(solution.isPowerOfTwo(n3));

        int n4 = 0;
        System.out.println(solution.isPowerOfTwo(n4));

    }
}
