
class Solution696 {
    public int countBinarySubstrings(String s) {
        int count = 0;
        int size = s.length();
        int[] groups = new int[size];

        int t = 0;
        groups[0] = 1;

        for (int i = 1; i < size; i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                t++;
                groups[t] = 1;

            } else {
                groups[t] += 1;
            }
        }

        for (int i = 1; i <= t; i++) {
            count += Math.min(groups[i - 1], groups[i]);
        }

        return count;
    }

}

public class CountBinarySubstrings {
    public static void main(String[] args) {
        Solution696 solution = new Solution696();

        System.out.println(solution.countBinarySubstrings("00110011"));

        System.out.println(solution.countBinarySubstrings("10101"));

        System.out.println(solution.countBinarySubstrings("00110"));

    }
}
