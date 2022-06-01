import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution17 {

    HashMap<Character, List<String>> phoneButtons = new HashMap<Character, List<String>>();

    void createPhoneButtons(HashMap<Character, List<String>> map) {
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
        int digit_size = digits.length();
        List<String> answer = new ArrayList<String>();
        if (digit_size == 0) return answer;

        createPhoneButtons(phoneButtons);
        recur(0, digits, answer, new String[digit_size]);

        return answer;
    }

    public void recur(int index, String digits, List<String> answer, String[] arr) {
        if(index == digits.length()) {
            answer.add(String.join("", arr));
            return;
        }

        char num = digits.charAt(index);
        List<String> nums = phoneButtons.get(num);

        for (String s : nums) {
            arr[index] = s;
            recur(index + 1, digits, answer, arr);
        }
    }
}


public class LetterCombinations {
    public static void main(String[] args) {
        Solution17 solution = new Solution17();

        String digits1 = "23";
        System.out.println(solution.letterCombinations(digits1));

        String digits2 = "";
        System.out.println(solution.letterCombinations(digits2));

        String digits3 = "2";
        System.out.println(solution.letterCombinations((digits3)));
    }
}
