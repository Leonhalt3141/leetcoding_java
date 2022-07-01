import java.util.Arrays;

class Solution66 {
    public int[] plusOne(int[] digits) {

        int size = digits.length;

        if (digits[size - 1] == 9) {
            int i = 1;
            while (digits[size - i] == 9) {
                if (size == i) {
                    if (digits[0] == 9) {
                        int[] result = new int[size + 1];
                        result[0] = 1;
                        return result;
                    } else {
                        digits[0] = digits[0] + 1;
                        return digits;
                    }
                }
                digits[size - i] = 0;
                i++;
            }
            digits[size - i] = digits[size - i] + 1;

        } else {
            digits[size - 1] = digits[size - 1] + 1;
        }
        return digits;
    }
}

public class PlusOne {
    public static void main(String[] args) {
        Solution66 solution = new Solution66();

        int[] digits1 = new int[]{1,2,3};
        System.out.println(Arrays.toString(solution.plusOne(digits1)));

        int[] digits2 = new int[]{4,3,2,1};
        System.out.println(Arrays.toString(solution.plusOne(digits2)));

        int[] digits3 = new int[]{9};
        System.out.println(Arrays.toString(solution.plusOne(digits3)));

        int[] digits4 = new int[]{8, 9, 9, 9};
        System.out.println(Arrays.toString(solution.plusOne(digits4)));

        int[] digits5 = new int[]{9, 8, 9};
        System.out.println(Arrays.toString(solution.plusOne(digits5)));
    }

}
