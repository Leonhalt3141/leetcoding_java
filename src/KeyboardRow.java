import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

class Solution500 {
    public String[] findWords(String[] words) {
        Queue<String> queue = new ArrayDeque<>();

        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        for (String word : words) {
            char[] wordArray = word.toCharArray();
            char firstC = wordArray[0];
            firstC = Character.toLowerCase(firstC);

            String row;
            if (firstRow.indexOf(firstC) > -1) row = firstRow;
            else if (secondRow.indexOf(firstC) > -1) row = secondRow;
            else row = thirdRow;

            boolean sameRow = true;

            for (char c : wordArray) {
                c = Character.toLowerCase(c);
                if (row.indexOf(c) == -1) {
                    sameRow = false;
                    break ;
                }
            }
            if (sameRow) queue.add(word);
        }
        int size = queue.size();
        String[] answer = new String[size];
        for (int i = 0; i < size; i++) answer[i] = queue.poll();
        return answer;
    }
}

public class KeyboardRow {
    public static void main(String[] args) {
        Solution500 solution = new Solution500();

        System.out.println(Arrays.toString(solution.findWords(new String[] {"Hello", "Alaska", "Dad", "Peace"})));

        System.out.println(Arrays.toString(solution.findWords(new String[] {"omk"})));

        System.out.println(Arrays.toString(solution.findWords(new String[] {"adsdf", "sfd"})));

    }
}
