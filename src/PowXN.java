
class Solution50 {
    public double myPow(double x, int n) {
        if (n == 0) return 1;

        if (n >= 0) {
            return pow(x, n);
        } else {
            return 1 / pow(x, -1 * n);
        }

    }

    double pow(double x, int n) {
        if (n == 0) return 1;

        return x * pow(x, n - 1);
    }

}

public class PowXN {
    public static void main(String[] args) {
        Solution50 solution = new Solution50();

        System.out.println(solution.myPow(2, 10));

        System.out.println(solution.myPow(2.1, 3));

        System.out.println(solution.myPow(2, -2));
    }
}
