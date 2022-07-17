
class Solution263 {
    public boolean isUgly(int n) {
        if (n == 0) return false;
        boolean loop = true;

        while(loop) {
            loop = false;
            if (n % 2 == 0) {
                n /= 2;
                loop = true;
            }
            if (n % 3 == 0) {
                n /= 3;
                loop =true;
            }
            if (n % 5 == 0) {
                n /= 5;
                loop =true;
            }
        }
        return n == 1;
    }
}

public class UglyNumber {
    public static void main(String[] args) {
        Solution263 solution = new Solution263();

        int n1 = 6;
        System.out.println(solution.isUgly(n1));

        int n2 = 1;
        System.out.println(solution.isUgly(n2));

        int n3 = 14;
        System.out.println(solution.isUgly(n3));

        int n4 = 0;
        System.out.println(solution.isUgly(n4));
    }
}
