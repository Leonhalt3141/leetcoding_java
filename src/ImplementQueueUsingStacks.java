import java.util.Stack;

class MyQueue {

    Stack<Integer> queue1;
    Stack<Integer> queue2;
    int size;

    public MyQueue() {
        queue1 = new Stack<>();
        queue2 = new Stack<>();
        size = 0;
    }

    public void push(int x) {
        queue1.push(x);
        size++;
    }

    public int pop() {
        for (int i = 0; i < size - 1; i++) {
            queue2.push(queue1.pop());
        }
        int value = queue1.pop();

        while(!queue2.isEmpty()) queue1.add(queue2.pop());
        size--;
        return value;
    }

    public int peek() {
        int value = 0;
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                value = queue1.pop();
                queue2.push(value);
            } else queue2.push(queue1.pop());
        }

        while(!queue2.isEmpty()) queue1.add(queue2.pop());

        return value;
    }

    public boolean empty() {
        return size == 0;
    }
}

public class ImplementQueueUsingStacks {
}
