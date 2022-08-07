import java.util.Arrays;

class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gSize = g.length;
        int sSize = s.length;

        int count = 0;
        int i = 0;
        int j = 0;

        while (i < gSize && j < sSize) {
            int kid = g[i];
            int cookie = s[j];

            if (kid <= cookie) {
                count++;
                i++;
            }
            j++;
        }

        return count;
    }
}

public class AssignCookies {
    public static void main(String[] args) {
        Solution455 solution = new Solution455();

        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        System.out.println(solution.findContentChildren(g1, s1));

        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        System.out.println(solution.findContentChildren(g2, s2));

        int[] g3 = {10, 9, 8, 7};
        int[] s3 = {5, 6, 7, 8};
        System.out.println(solution.findContentChildren(g3, s3));
    }
}
