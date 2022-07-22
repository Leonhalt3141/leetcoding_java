import java.util.Arrays;

class Solution344 {
    public void reverseString(char[] s) {
        int size = s.length;

        if (size == 1) return;
        int left = 0;
        int right = size - 1;
        char tempL;
        char tempR;

        while (left <= right) {
            tempL = s[left];
            tempR = s[right];

            s[left] = tempR;
            s[right] = tempL;

            left++;
            right--;
        }
    }
}

public class ReverseString {
    public static void main(String[] args) {
        Solution344 solution = new Solution344();

        char[] s1 = new char[]{'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s1);
        System.out.println(Arrays.toString(s1));

        char[] s2 = new char[]{'H', 'a', 'n', 'n', 'a', 'n'};
        solution.reverseString(s2);
        System.out.println(Arrays.toString(s2));
    }
}
