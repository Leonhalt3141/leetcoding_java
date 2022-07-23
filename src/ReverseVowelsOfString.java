import java.util.Arrays;

class Solution345 {
    public String reverseVowels(String s) {
        int size = s.length();
        if (size == 1) return s;

        char[] cArray = new char[size];

        int left = 0;
        int right = size - 1;

        while (left <= right) {
            char leftC = s.charAt(left);
            char rightC = s.charAt(right);

            if (isVowel(leftC) && isVowel(rightC)) {
                cArray[left] = rightC;
                cArray[right] = leftC;

                left++;
                right--;

            } else if (!isVowel(leftC) && !isVowel(rightC)) {
                cArray[left] = leftC;
                cArray[right] = rightC;

                left++;
                right--;
            } else if (!isVowel(leftC)) {
                cArray[left] = leftC;
                left++;
            } else if (!isVowel(rightC)) {
                cArray[right] = rightC;
                right--;
            }

        }

        return String.valueOf(cArray);

    }

    boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        Solution345 solution = new Solution345();

        String s1 = "hello";
        System.out.println(solution.reverseVowels(s1));

        String s2 = "leetcode";
        System.out.println(solution.reverseVowels(s2));

        String s3 = "aA";
        System.out.println(solution.reverseVowels(s3));
    }
}
