import java.util.ArrayList;
import java.util.List;

class Solution67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}

public class AddBinary {
    public static void main(String[] args) {
        Solution67 solution = new Solution67();

        String a1 = "11";
        String b1 = "1";
        System.out.println(solution.addBinary(a1, b1));

        String a2 = "10101011";
        String b2 = "1011";
        System.out.println(solution.addBinary(a2, b2));

        System.out.println('1' - '0' + '1' - '0');
        System.out.println(3 % 2);

        System.out.println(1 / 2);
        System.out.println(1 % 2);
    }
}
