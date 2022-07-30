import java.util.*;

class Solution387 {
    public int firstUniqChar(String s) {

        int size = s.length();
        if (size == 1) return 0;

        HashMap<Character, Integer> map = new HashMap<>();

        char[] charArray = s.toCharArray();
        char c;

        for (int i = 0; i < size; i++) {
            c = charArray[i];
            if (!map.containsKey(c)) map.put(c, i);
            else {
                map.put(c, Integer.MAX_VALUE);
            }
        }
        Set<Integer> index = new HashSet<>(map.values());
        int index_min = Collections.min(index);
        return (index_min != Integer.MAX_VALUE) ? index_min : -1;
    }

    /*
    Runtime: 51 ms, faster than 34.61% of Java online submissions for First Unique Character in a String.
    Memory Usage: 53.4 MB, less than 43.24% of Java online submissions for First Unique Character in a String.
     */

    public int firstUniqCharA(String s) {
        int size = s.length();
        if (size == 1) return 0;

        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : charArray) map.put(c, map.getOrDefault(c, 0) + 1);

        char c;
        for (int i = 0; i < size; i++) {
            c = charArray[i];
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        Solution387 solution = new Solution387();

        String s1 = "leetcode";
        System.out.println(solution.firstUniqCharA(s1));

        String s2 = "loveleetcode";
        System.out.println(solution.firstUniqCharA(s2));

        String s3 = "aabb";
        System.out.println(solution.firstUniqCharA(s3));
    }
}
