public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        int size = str.length();

        int left = 0;
        int right = size - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + isPalindrome(121));

        System.out.println("Example 2: " + isPalindrome(-121));

        System.out.println("Example 3: " + isPalindrome(10));

        System.out.println("Example 3: " + isPalindrome(11));

    }
}
