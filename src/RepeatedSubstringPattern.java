import java.util.ArrayList;
import java.util.List;

class Solution459 {
    public boolean repeatedSubstringPattern(String s) {

        int size = s.length();
        if (size == 1) return false;
        if (size % 2 == 1) return false;

        List<Integer> pattern_size = new ArrayList<>();
        for (int i = 2; i <= size / 2; i++) {
            if (size % i == 0) pattern_size.add(i);
        }

        boolean matched = true;

        for (int psize : pattern_size) {
            String pattern = s.substring(0, psize);
            int count = size / psize;

            for (int i = 0; i < count; i++) {
                String check = s.substring(i*psize, i*psize+psize);
                matched = pattern.equals(check);
            }
            if (matched) return true;
        }

        return matched;
    }

    public boolean repeatedSubstringPatternA(String s) {
        char[] arr = s.toCharArray();
        int size = s.length();
        for (int i =0; i < size / 2; i++) {
            if (size % (i + 1) != 0) continue;
            if (form(arr, i)) return true;
        }
        return false;
    }

    private boolean form(char[] arr, int i) {
        for (int j = 2; j * (i + 1) <= arr.length; j++) {
            int fr = (j - 1) * (i + 1);
            for (int k = 0; k <= i; k++) {
                if (arr[fr + k] != arr[k]) return false;
            }
        }
        return true;
    }
}

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        Solution459 solution = new Solution459();

        System.out.println(solution.repeatedSubstringPattern("abab"));

        System.out.println(solution.repeatedSubstringPattern("aba"));

        System.out.println(solution.repeatedSubstringPattern("abcabcabcabc"));

        System.out.println(solution.repeatedSubstringPattern("ababba"));

        System.out.println(solution.repeatedSubstringPattern("abcabcabcabc"));

        System.out.println(solution.repeatedSubstringPattern("abcdab"));

        System.out.println(solution.repeatedSubstringPattern("abaababaab"));

        System.out.println(solution.repeatedSubstringPattern("ababab"));
    }
}
