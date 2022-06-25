import java.util.Stack;

class Solution224 {

    public int calculate(String s) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        int size = s.length();
        int sign = 1;

        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);

            if (c == ' ') continue;

            if (Character.isDigit(c)) {
                int number = Character.getNumericValue(c);
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    number = number * 10 + Character.getNumericValue(s.charAt(i + 1));
                    i++;
                }
                result += sign * number;
            }
            else if (c == '+') sign = 1;
            else if (c == '-') sign = -1;
            else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                int prevSign = stack.pop();
                int prevRes = stack.pop();
                result = prevSign * result + prevRes;
            }
        }
        return result;
    }
}

public class BasicCalculator {
    public static void main(String[] args) {
        Solution224 solution = new Solution224();

        String s1 = "1 + 1";
        System.out.println(solution.calculate(s1));

        String s2 = " 2-1 + 2 ";
        System.out.println(solution.calculate(s2));

        String s3 = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(solution.calculate(s3));
    }
}
