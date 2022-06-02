import java.util.HashMap;
import java.util.Stack;

class Solution20 {
    public boolean isValid(String s) {

        int size = s.length();
        if (size < 2) return false;

        HashMap<Character, Character> pareMap = new HashMap<>();
        pareMap.put(')', '(');
        pareMap.put('}', '{');
        pareMap.put(']', '[');

        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i<size; i++) {
            char par = s.charAt(i);

            if (pareMap.containsKey(par)) {
                char topElement = (stack.isEmpty()) ? '#' : stack.pop();

                if (topElement != pareMap.get(par)) return false;
            } else {
                stack.push(par);
            }
        }
        return stack.isEmpty();
    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        Solution20 solution = new Solution20();

        String s1 = "()";
        System.out.println(solution.isValid(s1));

        String s2 = "()[]{}";
        System.out.println(solution.isValid(s2));

        String s3 = "(]";
        System.out.println(solution.isValid(s3));

        String s4 = "([)]";
        System.out.println(solution.isValid(s4));
    }
}
