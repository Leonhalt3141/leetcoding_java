import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {

    Queue<Integer> stack1;
    Queue<Integer> stack2;
    int size;

    public MyStack() {
        this.stack1 = new ArrayDeque<>();
        this.stack2 = new ArrayDeque<>();
        this.size = 0;
    }

    public void push(int x) {
        this.stack1.add(x);
        this.size++;
    }

    public int pop() {
        int value = 0;
        while(!this.stack1.isEmpty()) {
            int size = stack1.size();
            for (int i = 0; i < size - 1; i++) {
                this.stack2.add(this.stack1.poll());
            }
            value = stack1.poll();

        }

        while(!this.stack2.isEmpty()) {
            this.stack1.add(this.stack2.poll());
        }
        this.size--;
        return value;
    }

    public int top() {
        int value = 0;
        while(!this.stack1.isEmpty()) {
            value = this.stack1.peek();
            this.stack2.add(this.stack1.poll());
        }

        while(!this.stack2.isEmpty()) {
            this.stack1.add(this.stack2.poll());
        }

        return value;
    }

    public boolean empty() {
        return this.size == 0;
    }
}

public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.toString());
        System.out.println(queue.remove());
        System.out.println(queue.toString());
        System.out.println(queue.poll());
        System.out.println(queue.toString());
    }
}
