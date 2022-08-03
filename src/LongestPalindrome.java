import java.util.HashMap;

class Solution409 {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        StringBuilder sbLeft = new StringBuilder();
        StringBuilder sbRight = new StringBuilder();
        String center = "";

        int size;

        for (char key : map.keySet()) {
            size = map.get(key);

            if (center.equals("")) {
                if (size == 1) {
                    center = Character.toString(key);
                    size = 0;
                } else if (size % 2 == 1) {
                    center = Character.toString(key);

                    for (int i = 0; i < size / 2; i++) {
                        sbLeft.append(key);
                        sbRight.append(key);
                    }
                    size = 0;
                }
            }
            if (size >= 2) {
                for (int i = 0; i < size / 2; i++) {
                    sbLeft.append(key);
                    sbRight.append(key);
                }
            }
        }
        String result = sbLeft + center + sbRight.reverse();
        return result.length();
    }

}


public class LongestPalindrome {
    public static void main(String[] args) {
        Solution409 solution = new Solution409();

        String s1 = "abccccdd";
        System.out.println(solution.longestPalindrome(s1));

        String s2 = "a";
        System.out.println(solution.longestPalindrome(s2));

        String s3 = "bb";
        System.out.println(solution.longestPalindrome(s3));
    }
}
