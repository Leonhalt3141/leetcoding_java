
class Solution680 {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return checkPalindrome(s, i, j - 1) || checkPalindrome(s, i + 1, j);
            }
            i++;
            j--;
        }
        return true;
    }

    boolean checkPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}

public class ValidPalindrome2 {
    public static void main(String[] args) {
        Solution680 solution = new Solution680();

        System.out.println(solution.validPalindrome("aba"));

        System.out.println(solution.validPalindrome("abca"));

        System.out.println(solution.validPalindrome("abc"));

        System.out.println(solution.validPalindrome("deeee"));

        System.out.println(solution.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}
