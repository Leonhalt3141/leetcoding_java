
class Solution557 {
    public String reverseWords(String s) {
        String[] strArray = s.split(" ");
        String[] reverseArray = new String[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            reverseArray[i] = reverse(strArray[i]);
        }
        return String.join(" ", reverseArray);
    }

    String reverse(String str) {
        int size = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}

public class ReverseWordsInAString3 {
    public static void main(String[] args) {
        Solution557 solution = new Solution557();

        System.out.println(solution.reverseWords("Let's take LeetCode contest"));

        System.out.println(solution.reverseWords("God Ding"));
    }
}
