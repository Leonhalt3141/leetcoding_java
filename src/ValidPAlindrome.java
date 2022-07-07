
class Solution125 {
    public boolean isPalindrome(String s) {
        if (s == null) return false;

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        int size = sb.length();
        int mid = size / 2 + 1;

        if (size == 0) return true;

        String leftS = sb.substring(0, mid);
        String rightS = sb.reverse().substring(0, mid);

        return leftS.equals(rightS);
    }

    public boolean isPalindromeA(String s) {
        if (s == null) return false;

        int left = 0;
        int right = s.length() - 1;

        char leftC;
        char rightC;

        while (left <= right) {
            leftC = s.charAt(left);
            rightC = s.charAt(right);

            if (!Character.isLetterOrDigit(leftC)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightC)) {
                right--;
            } else {
                if (Character.toLowerCase(leftC) != Character.toLowerCase(rightC)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}

public class ValidPAlindrome {
    public static void main(String[] args) {
        Solution125 solution = new Solution125();

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(solution.isPalindromeA(s1));

        String s2 = "race a car";
        System.out.println(solution.isPalindromeA(s2));

        String s3 = " ";
        System.out.println(solution.isPalindromeA(s3));

        String s4 = "0P";
        System.out.println(solution.isPalindromeA(s4));
    }
}
