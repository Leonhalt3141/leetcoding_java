
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class MinStack {

    private final Stack<Integer> stack;
    private final List<Integer> list;
    private int min;

    public MinStack() {
        stack = new Stack<>();
        list = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        stack.push(val);
        if (min > val) min = val;
        list.add(val);
    }

    public void pop() {
        int popped_value = stack.pop();
        list.remove((Integer) popped_value);
        if (min == popped_value) {
            min = Integer.MAX_VALUE;
            for (int v : list) {
                min = Math.min(v, min);
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }



    public void print() {
        System.out.println(stack.toString());
    }
}

class MinStackA {

    private StackNode stack;
    private StackNode minNodes;

    public MinStackA () {

    }

    public void push(final int val) {
        stack = new StackNode(val, stack);

        if (minNodes == null || minNodes.value() >= val) {
            minNodes = new StackNode(val, minNodes);
        }
    }

    public void pop() {
        if (isEmpty()) return;

        if (minNodes != null && minNodes.value() == stack.value()) {
            minNodes = minNodes.prev();
        }

        stack = stack.prev();

    }

    public int top() {
        return isEmpty() ? -1 : stack.value();
    }

    public int getMin() {
        return isMinEmpty() ? -1 : minNodes.value();
    }

    private boolean isEmpty() {
        return null == stack;
    }

    private boolean isMinEmpty() {
        return null == minNodes;
    }

    private static final class StackNode {
        private final int value;
        private final StackNode prev;

        StackNode(int value, StackNode p) {
            this.value = value;
            this.prev = p;
        }

        int value() {
            return value;
        }

        StackNode prev() {
            return prev;
        }
    }
}

public class MinStackSolution {
    public static void main(String[] args) {
        MinStack minstack = new MinStack();
        minstack.push(-2);
        minstack.push(0);
        minstack.push(-3);
        System.out.println(minstack.getMin());
        minstack.pop();
        System.out.println(minstack.top());
        System.out.println(minstack.getMin());
        minstack.print();
    }
}
