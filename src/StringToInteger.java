import java.util.Objects;

/**
 * https://leetcode.com/problems/string-to-integer-atoi/
 */

class Solution8 {
    public int myAtoi(String s) {
        s = s.trim();
        boolean isPositive = true;
        int ans = 0;
        int i = 0;

        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') isPositive = false;
            i++;
        }

        for(; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) break;

            int digit = Integer.parseInt(Character.toString(s.charAt(i)));
            if (ans > (Integer.MAX_VALUE - digit) / 10)
                return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            ans = ans * 10 + digit;
        }
        return isPositive ? ans : - 1 * ans;
    }
}

public class StringToInteger {
    public static void main(String[] args) {
        Solution8 solution = new Solution8();

        String s1 = "42";
        System.out.println(solution.myAtoi(s1));

        String s2 = "   -42";
        System.out.println(solution.myAtoi(s2));

        String s3 = "4193 with words";
        System.out.println(solution.myAtoi(s3));

        String s4 = "0042";
        System.out.println(solution.myAtoi(s4));

        String s5 = "-91283472332";
        System.out.println(s5);

        String s6 = "+-12";
        System.out.println(solution.myAtoi(s6));

        String s7 = "";
        System.out.println(solution.myAtoi(s7));
    }
}
