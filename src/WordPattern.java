import java.util.HashMap;
import java.util.Map;

class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();

        int size = pattern.length();

        String[] stringArray = s.split(" ");
        char[] charArray = pattern.toCharArray();

        if (size != stringArray.length) return false;

        for (int i = 0; i < size; i++) {
            if (!map.containsKey(charArray[i])) {
                if (map.containsValue(stringArray[i])) return false;
                map.put(charArray[i], stringArray[i]);
            } else {
                if (!map.get(charArray[i]).equals(stringArray[i])) return false;
            }
        }
        return true;
    }
}

public class WordPattern {
    public static void main(String[] args) {
        Solution290 solution = new Solution290();

        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern1, s1));

        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        System.out.println(solution.wordPattern(pattern2, s2));

        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern3, s3));

        String pattern4 = "abba";
        String s4 = "dog dog dog dog";
        System.out.println(solution.wordPattern(pattern4, s4));

        String pattern5 = "aaa";
        String s5 = "aa aa aa aa";
        System.out.println(solution.wordPattern(pattern5, s5));
    }
}
