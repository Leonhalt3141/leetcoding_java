import java.util.Stack;

class Solution682 {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String s : operations) {
            switch (s) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    int value = stack.peek();
                    stack.add(value * 2);
                    break;
                case "+":
                    int two = stack.pop();
                    int one = stack.pop();
                    stack.add(one);
                    stack.add(two);
                    stack.add(one + two);
                    break;
                default:
                    stack.add(Integer.parseInt(s));
                    break;
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) sum += stack.pop();
        return sum;
    }

}

public class BaseBallGame {
    public static void main(String[] args) {
        Solution682 solution = new Solution682();

        System.out.println(solution.calPoints(new String[]{"5","2","C","D","+"}));

        System.out.println(solution.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));

        System.out.println(solution.calPoints(new String[]{"1","C"}));
    }
}
