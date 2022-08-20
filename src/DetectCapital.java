
class Solution520 {
    public boolean detectCapitalUse(String word) {
        int size = word.length();

        if (size == 1) return true;

        boolean isFirstUpper = Character.isUpperCase(word.charAt(0));

        if (isFirstUpper) {
            if (size == 2) return true;

            boolean isUpper = Character.isUpperCase(word.charAt(1));

            if (isUpper) {
                for (int i = 2; i < size; i++) {
                    if (Character.isLowerCase(word.charAt(i))) return false;
                }
            } else {
                for (int i = 2; i < size; i++) {
                    if (Character.isUpperCase(word.charAt(i))) return false;
                }
            }
        } else {
            for (int i = 1; i < size; i++) {
                if (Character.isUpperCase(word.charAt(i))) return false;
            }
        }
        return true;
    }
}

public class DetectCapital {
    public static void main(String[] args) {
        Solution520 solution = new Solution520();

        System.out.println(solution.detectCapitalUse("USA"));

        System.out.println(solution.detectCapitalUse("FlaG"));
    }
}
