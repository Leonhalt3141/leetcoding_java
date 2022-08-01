
class Solution392 {
    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        while (i < s.length() && j < t.length()) {
            if (sArray[i] == tArray[j]) {
                i++;
            }
            j++;
        }
        return i == s.length();

    }
}

public class IsSubsequence {
    public static void main(String[] args) {
        Solution392 solution = new Solution392();

        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println(solution.isSubsequence(s1, t1));

        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println(solution.isSubsequence(s2, t2));
    }
}
