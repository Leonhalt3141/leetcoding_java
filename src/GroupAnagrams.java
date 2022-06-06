import sun.security.util.ArrayUtil;

import java.util.*;

class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> strList = new ArrayList<String>(Arrays.asList(strs));
        List<List<String>> answer = new ArrayList<>();

        getAnagramGroup(strList, answer);
        return answer;
    }

    void getAnagramGroup(List<String> strList, List<List<String>> answer) {
        if (strList.isEmpty()) {
            return ;
        }

        String word = strList.get(0);
        List<String> anagram = new ArrayList<>();
        anagram.add(word);
        strList.remove(word);

        List<String> removeStrs = new ArrayList<String>();

        for (String str : strList) {
            if (checkAnagram(word, str)) {
                anagram.add(str);

                removeStrs.add(str);
            }
        }
        if (!removeStrs.isEmpty()) strList.removeAll(removeStrs);
        answer.add(anagram);
        getAnagramGroup(strList, answer);
    }

    boolean checkAnagram(String word, String target) {
        if (word.length() != target.length()) return false;

        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);

            if (!word.contains(Character.toString(c))) return false;
            word = word.replaceFirst(Character.toString(c), "");

        }
        return true;
    }

    void printAnagrams(List<List<String>> groups) {
        System.out.println(groups.toString());
    }

    List<List<String>> hashMapAnagram(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ch = new char[26];

            for (char ca : s.toCharArray()) {
                ch[ca - 'a'] ++;
            }
            String keyStr = String.valueOf(ch);

            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }

            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }

}

public class GroupAnagrams {

    public static void main(String[] args) {
        Solution49 solution = new Solution49();

        String[] strs1 = new String[] {"eat","tea","tan","ate","nat","bat"};
        solution.printAnagrams(solution.groupAnagrams(strs1));

        String[] strs2 = new String[] {"","",""};
        solution.printAnagrams(solution.groupAnagrams(strs2));

        String[] strs3 = new String[] {"ac","c"};
        solution.printAnagrams(solution.groupAnagrams(strs3));

        String[] strs4 = new String[] {"ddddddddddg","dgggggggggg"};
        solution.printAnagrams(solution.groupAnagrams(strs4));

    }


}
