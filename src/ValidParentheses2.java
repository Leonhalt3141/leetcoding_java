import java.util.Stack;

public class ValidParentheses2 {
    public boolean isValid(String s) {
        int size = s.length();
        if (size % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty() ||
                        (c == ')' && stack.pop() != '(') ||
                        (c == '}' && stack.pop() != '{') ||
                        (c == ']' && stack.pop() != '[')
                ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
