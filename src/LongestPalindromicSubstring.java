import java.sql.Struct;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 */


class Solution5 {

    int index = 0;
    int mySize = 1;

    void checkPalindromeEven(String s, int c1, int c2) {
        int i = c1;
        int j = c2;
        int size = s.length();

        while (i >= 0 && j < size && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        int palindromeHalfSize = j - i - 1;

        if (palindromeHalfSize > mySize) {
            mySize = palindromeHalfSize;
            index = c1;
        }

    }

    void checkPalindromeOdd(String s, int center) {
        int i = center;
        int j = center;
        int size = s.length();

        while (i >= 0 && j < size && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        int palindromeHalfSize = j - i - 1;

        if (palindromeHalfSize > mySize) {
            mySize = palindromeHalfSize;
            index = center;
        }
    }

    public String longestPalindrome(String s) {
        int size = s.length();

        for (int i = 0; i < size - 1; i++) {
            checkPalindromeOdd(s, i);

            if (s.charAt(i) == s.charAt(i+1)) {
                checkPalindromeEven(s, i, i+1);
            }
        }
        int left = index - (mySize - 1) / 2;
        return s.substring(left, left + mySize);
    }

//    private String findPalindrome(String str, String palindrome) {
//        int tempSize = str.length();
//        int middleIndex = (tempSize / 2);
//
//        String leftString = str.substring(0, middleIndex);
//
//        String rightString = (tempSize % 2 == 0) ?
//                str.substring(middleIndex) : str.substring(middleIndex + 1);
//
//        StringBuilder buf = new StringBuilder(rightString);
//        rightString = String.valueOf(buf.reverse());
//
//        if (leftString.equals(rightString) & tempSize > palindrome.length()) {
//            return str;
//        }
//        return "";
//    }
//
//    public String longestPalindrome(String s) {
//        int size = s.length();
//
//        if (size == 1) return s;
//
//        String palindrome = "";
//
//        for (int i=0; i < size; i++) {
//            String leftS = s.substring(i, i+1);
//            int rightIndex = s.lastIndexOf(leftS);
//
//            while (rightIndex > i) {
//                String tempS = s.substring(i, rightIndex + 1);
//                String tempP = findPalindrome(tempS, palindrome);
//
//                if (tempP.length() > palindrome.length()) {
//                    palindrome = tempP;
//                    rightIndex = 0;
//                } else rightIndex = s.substring(0, rightIndex).lastIndexOf(leftS);
//            }
//
//        }
//        if (palindrome.equals("")) return s.substring(0, 1);
//        return palindrome;
//    }
}

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution5 solution = new Solution5();

        String input1 = "babad";
        System.out.println(solution.longestPalindrome(input1));

        String input2 = "cbbd";
        System.out.println(solution.longestPalindrome(input2));

        String input3 = "aacabdkacaa";
        System.out.println(solution.longestPalindrome(input3));

        String input4 = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
        System.out.println(solution.longestPalindrome(input4));


    }
}
