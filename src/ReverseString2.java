
class Solution541 {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();

        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start;
            int j = Integer.min(start + k - 1, a.length - 1);

            while (i < j) {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return new String(a);
    }
}

public class ReverseString2 {

    public static void main(String[] args) {
        Solution541 solution = new Solution541();

        System.out.println(solution.reverseStr("abcdefg", 2));

        System.out.println(solution.reverseStr("abcd", 2));
    }
}
