import java.util.ArrayList;
import java.util.List;

class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
//        char[] current = new char[2 * n];
//        generateAll(current, 0, result);
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    public void generateAll(char[] current, int position, List<String>result) {
        if (position == current.length) {
            if (checkValid(current)) {
                result.add(new String(current));
            }
        } else {
            current[position] = '(';
            generateAll(current, position + 1, result);
            current[position] = ')';
            generateAll(current, position + 1, result);
        }
    }

    public boolean checkValid(char[] current) {
        int balance = 0;
        for (char c: current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;

        }
        return (balance == 0);
    }

    public void backtrack(List<String> answer, StringBuilder current, int open, int close, int max) {
        if (current.length() == max * 2) {
            answer.add(current.toString());
            return;
        }

        if (open < max) {
            current.append("(");
            backtrack(answer, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1);
        }

        if (close < open) {
            current.append(")");
            backtrack(answer, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1);
        }
    }
}


class Solution22_02 {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        generate(answer, new StringBuilder(), 0, 0, n * 2);
        return answer;
    }

    void generate(List<String> answer, StringBuilder current, int open, int close, int max) {
        if (current.length() == max) {
            answer.add(current.toString());
            return;
        }

        if (open < max / 2) {
            current.append("(");
            generate(answer, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1);
        }

        if (close < open) {
            current.append(")");
            generate(answer, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1);
        }

    }
}

public class GenerateParentheses {
    public static void main(String[] args) {
        Solution22_02 solution = new Solution22_02();

        int n1 = 3;
        System.out.println(solution.generateParenthesis(n1));
    }
}
