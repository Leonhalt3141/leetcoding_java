
class Solution43 {
    public String multiply(String num1, String num2) {
        int num1_size = num1.length();
        int num2_size = num2.length();

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < num2_size; i++) {
            int a = num2.charAt(num2_size - i - 1) - '0';
            int carry = 0;
            for (int j = 0; j < num1_size; j++) {
                int b = num1.charAt(num1_size - j - 1) - '0';
                int calc = (a * b) + carry;

                if (i > 0) {
                    int dummy = answer.charAt(num2_size - i - 1) - '0';
                    calc += dummy;
                }

                if (calc >= 10) {
                    calc -= 10;
                    carry = 1;
                } else {
                    carry = 0;
                }

                answer.insert(0, calc);

            }
        }
        return answer.toString();
    }
}

public class MultiplyStrings {
    public static void main(String[] args) {
        Solution43 solution = new Solution43();

//        System.out.println(solution.multiply("2", "3"));

        System.out.println(solution.multiply("123", "6"));

        System.out.println(solution.multiply("123", "456"));
    }
}
