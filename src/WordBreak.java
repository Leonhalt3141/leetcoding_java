import java.util.ArrayList;
import java.util.List;

class Solution139 {

    List<Boolean> results;

    public boolean wordBreak(String s, List<String> wordDict) {
        int size = s.length();
        boolean[] dp = new boolean[size + 1];
        dp[0] = true;

        for (int i = 1; i <= size; i ++) {
            for (int j = 0; j< i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[size];
    }

    void removeWord(String s, List<String> wordDict) {
        if (s.length() == 0) {
            results.add(true);
            return;
        }

        for (String  word : wordDict) {
            if (s.length() >= word.length()) {
                String targetS = s.substring(0, word.length());
                if (targetS.equals(word)) {
                    String removedS = s.substring(word.length());
                    removeWord(removedS, wordDict);
                }
            } else {
                results.add(false);
            }
        }

    }
}

public class WordBreak {
    public static void main(String[] args) {
        Solution139 solution = new Solution139();

        String s1 = "leetcode";
        List<String> wordDict1 = new ArrayList<>();
        wordDict1.add("leet");
        wordDict1.add("code");

        System.out.println(solution.wordBreak(s1, wordDict1));

        String s2 = "applepenapple";
        List<String> wordDict2 = new ArrayList<>();
        wordDict2.add("apple");
        wordDict2.add("pen");

        System.out.println(solution.wordBreak(s2, wordDict2));

        String s3 = "catsandog";
        List<String> wordDict3 = new ArrayList<>();
        wordDict3.add("cats");
        wordDict3.add("dog");
        wordDict3.add("sand");
        wordDict3.add("and");
        wordDict3.add("cat");


        System.out.println(solution.wordBreak(s3, wordDict3));

        String s4 = "aaaaaaa";
        List<String> wordDict4 = new ArrayList<>();
        wordDict4.add("aaaa");
        wordDict4.add("aaa");

        System.out.println(solution.wordBreak(s4, wordDict4));

        String s5 = "cars";
        List<String> wordDict5 = new ArrayList<>();
        wordDict5.add("car");
        wordDict5.add("ca");
        wordDict5.add("rs");

        System.out.println(solution.wordBreak(s5, wordDict5));

    }
}
