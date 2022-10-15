
class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        char answer = Character.MAX_VALUE;

        char min_c = Character.MAX_VALUE;

        for (char c : letters) {
            if (c > target && answer >= c) answer = c;

            if (min_c > c) min_c = c;
        }

        if (answer == Character.MAX_VALUE) answer = min_c;
        return answer;
    }
}

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        Solution744 solution = new Solution744();

        System.out.println(solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));

        System.out.println(solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));

        System.out.println(solution.nextGreatestLetter(new char[]{'x', 'x', 'y', 'y'}, 'z'));
    }
}
