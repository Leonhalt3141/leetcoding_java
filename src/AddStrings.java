/**
 * https://leetcode.com/problems/add-strings/
 */

class AddStringsSolution {
    public String addStrings(String num1, String num2) {
        StringBuilder buf = new StringBuilder();

        int size = Math.max(num1.length(), num2.length());

        int roundUp = 0;
        String s = String.valueOf(roundUp);

        for (int i = 0; i < size; i++) {
            int value1 = (i < num1.length()) ? Integer.parseInt(num1.substring(num1.length() - (i+1), num1.length() - i)) : 0;
            int value2 = (i < num2.length()) ? Integer.parseInt(num2.substring(num2.length()-(i+1), num2.length() - i)) : 0;

            int totalValue = value1 + value2 + roundUp;
            roundUp = totalValue / 10;
            buf.insert(0, totalValue % 10);
        }

        if (roundUp > 0) buf.insert(0, roundUp);
        return buf.toString();

    }
}

public class AddStrings {
    public static void main(String[] args) {
        AddStringsSolution solution = new AddStringsSolution();

        String num1_1 = "11";
        String num2_1 = "123";

        System.out.println(solution.addStrings(num1_1, num2_1));

        String num1_2 = "456";
        String num2_2 = "77";

        System.out.println(solution.addStrings(num1_2, num2_2));

        String num1_3 = "0";
        String num2_3 = "0";

        System.out.println(solution.addStrings(num1_3, num2_3));

    }
}
