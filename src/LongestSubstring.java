/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        StringBuilder uniqueStrings = new StringBuilder();

        int left = 0;
        int right = 0;
        int max_count = 0;

        while (right < size) {
            String str = String.valueOf(s.charAt(right));

            int index = uniqueStrings.indexOf(str, left);

            if (index > -1) left = index + 1;

            uniqueStrings.append(str);
            right++;
            max_count = Math.max(max_count, right - left);

        }
        return max_count;

//        if (size > 1) {
//            int max_count = 0;
//            for (int i = 0; i < size; i ++) {
//                String c1 = s.substring(i, i+1);
//
//                if (uniqueStrings.indexOf(c1) > -1) {
//                    uniqueStrings.delete(0, uniqueStrings.indexOf(c1) + 1);
//                }
//                uniqueStrings.append(c1);
//
//                if (uniqueStrings.length() > max_count) max_count = uniqueStrings.length();
//            }
//            return max_count;
//        }
//        return size;
    }
}

public class LongestSubstring {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();

        String s1 = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s1));

        String s2 = "bbbbb";
        System.out.println(solution.lengthOfLongestSubstring(s2));

        String s3 = "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(s3));

        System.out.println(solution.lengthOfLongestSubstring("dvdf"));

    }
}
