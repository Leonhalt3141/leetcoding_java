import java.util.HashMap;

class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c,  map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c) && map.get(c) > 0) map.put(c, map.get(c) - 1);
            else return false;
        }
        return true;

    }
}


public class RansomNote {
    public static void main(String[] args) {
        Solution383 solution = new Solution383();

        String ransomNote = "aa";
        String magazine = "aab";

        System.out.println(solution.canConstruct(ransomNote, magazine));
    }
}
