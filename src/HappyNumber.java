import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution202 {
    public boolean isHappy(int n) {
        Set<Integer> check = new HashSet<>();

        while (n != 1 && !check.contains(n)) {
            check.add(n);
            n = calcNumber(n);
        }
        return n == 1;
    }

    int calcNumber(int n) {
        int value = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            value += d * d;
        }
        return value;
    }

}

public class HappyNumber {
    public static void main(String[] args) {
        Solution202 solution = new Solution202();

        int n1 = 19;
        System.out.println(solution.isHappy(n1));

        int n2 = 2;
        System.out.println(solution.isHappy(n2));

        int n3 = 7;
        System.out.println(solution.isHappy(n3));

        int n4 = 1111111;
        System.out.println(solution.isHappy(n4));

    }
}
