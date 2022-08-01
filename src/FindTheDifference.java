

class Solution389 {
    public char findTheDifference(String s, String t) {
        if (s.equals("")) return t.charAt(0);

        char[] sArray = s.toCharArray();
        char sum = sArray[0];

        for (int i = 1; i < sArray.length; i++) sum ^= sArray[i];

        for (char c : t.toCharArray()) {
            sum ^= c;
        }

        return sum;
    }
}

public class FindTheDifference {
    public static void main(String[] args) {
        Solution389 solution = new Solution389();

        String s1 = "abcd";
        String t1 = "abcde";
        System.out.println(solution.findTheDifference(s1, t1));

        String s2 = "";
        String t2 = "y";
        System.out.println(solution.findTheDifference(s2, t2));
    }
}
