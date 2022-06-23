import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution202 {
    public boolean isHappy(int n) {
        String number = calcNumber(String.valueOf(n));
        Set<Integer> check = new HashSet<>();

        while (number.length() != 1 || !check.contains(Integer.parseInt(number))) {
            number = calcNumber(number);
            check.add(Integer.parseInt(number));
        }
        return number.equals("1");
    }

    String calcNumber(String number) {
        int value = 0;
        char[] numbers = number.toCharArray();
        for (char v : numbers) {
            value += Math.pow(Character.getNumericValue(v), 2);
        }
        return String.valueOf(value);
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
