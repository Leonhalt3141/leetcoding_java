
class Solution680 {
    public boolean validPalindrome(String s) {
        int size = s.length();
        if (size == 1) return false;

        int left = 0;
        int right = size - 1;


        boolean deleted = false;
        char[] charArray = s.toCharArray();

        while (left < right) {
            if (charArray[left] != charArray[right] && !deleted) {
                if (charArray[left + 1] == charArray[right]) {
                    left++;
                } else if (charArray[left] == charArray[right - 1]) {
                    right--;
                } else {
                    System.out.println(1);
                    return false;
                }
                deleted = true;
            } else if (charArray[left] != charArray[right] && deleted) {
                System.out.println(2 + " " + left + " " + right + " " + deleted);
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}

public class ValidPalindrome2 {
    public static void main(String[] args) {
        Solution680 solution = new Solution680();

//        System.out.println(solution.validPalindrome("aba"));
//
//        System.out.println(solution.validPalindrome("abca"));
//
//        System.out.println(solution.validPalindrome("abc"));
//
//        System.out.println(solution.validPalindrome("deeee"));

        System.out.println(solution.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}
