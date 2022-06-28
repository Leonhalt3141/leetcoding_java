import java.util.HashMap;
import java.util.Hashtable;
import java.util.PriorityQueue;

class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        PriorityQueue<Character> sQueue = new PriorityQueue<>();
        PriorityQueue<Character> tQueue = new PriorityQueue<>();

        for (int i = 0; i < s.length(); i++) {
            sQueue.add(s.charAt(i));
            tQueue.add(t.charAt(i));
        }

        while (!sQueue.isEmpty()) {
            if (sQueue.peek() == tQueue.peek()) {
                sQueue.poll();
                tQueue.poll();
            } else return false;
        }
        return true;
    }

    public boolean isAnagramA(String s, String t) {
        if (s.length() != t.length()) return false;

        Hashtable<Character, Integer> tMap = new Hashtable<>();

        for (char c : t.toCharArray()) {
            if (!tMap.containsKey(c)) {
                tMap.put(c, 1);
            } else {
                int value = tMap.get(c);
                tMap.replace(c, value + 1);
            }
        }

        for (char c: s.toCharArray()) {
            if (tMap.containsKey(c)) {
                int value = tMap.get(c);
                if (value > 0) {
                    tMap.replace(c, value - 1);
                } else {
                    return false;
                }
            } else return false;
        }
        return true;
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        Solution242 solution = new Solution242();

        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(solution.isAnagramA(s1, t1));

        String s2 = "rat";
        String t2 = "cat";
        System.out.println(solution.isAnagramA(s2, t2));
    }
}
