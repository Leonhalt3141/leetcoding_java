import java.util.HashMap;

class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        int size1 = s.length();
        int size2 = t.length();

        if (size1 != size2) return false;

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < size1; i++) {
            String key = s.substring(i, i+1);
            if (!map.containsKey(key)) {
                map.put(key, t.substring(i, i+1));
            }
        }

        StringBuilder uniequeT = new StringBuilder();
        for (char c : t.toCharArray()) {
            if (!uniequeT.toString().contains(Character.toString(c))) {
                uniequeT.append(c);
            }
        }

        if (map.keySet().size() != uniequeT.length()) return false;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size1; i++) {
            sb.append(map.get(s.substring(i, i + 1)));
        }

        return sb.toString().equals(t);
    }
}

public class IsomorphicStrings {
    public static void main(String[] args) {
        Solution205 solution = new Solution205();

        String s1 = "egg";
        String t1 = "add";
        System.out.println(solution.isIsomorphic(s1, t1));

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(solution.isIsomorphic(s2, t2));

        String s3 = "paper";
        String t3 = "title";
        System.out.println(solution.isIsomorphic(s3, t3));

        String s4 = "badc";
        String t4 = "baba";
        System.out.println(solution.isIsomorphic(s4, t4));
    }
}
