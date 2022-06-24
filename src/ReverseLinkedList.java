import java.util.ArrayList;
import java.util.Stack;

class Solution206 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        Stack<Integer> values = new Stack<>();

        ListNode node = head;

        while (node != null) {
            values.add(node.val);
            node = node.next;
        }

        ListNode rHead = new ListNode();
        ListNode rNode = rHead;
        ListNode prevNode = null;
        while (!values.isEmpty()) {
             rNode.val = values.pop();
             prevNode = rNode;
             rNode = new ListNode();
             prevNode.next = rNode;
        }
        prevNode.next = null;
        return rHead;
    }

    public ListNode reverseListA(ListNode head) {
        if (head == null) return null;

        ListNode node = head;
        ListNode prev = null;
        ListNode reversed = null;

        while (node != null) {
            final ListNode next = node.next;

            if (node.next == null) {
                reversed = node;
            }
            node.next = prev;
            prev = node;
            node = next;
        }
        return reversed;

    }

    void printNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val + ", ");
            node = node.next;
        }
        System.out.println("");
    }

}

public class ReverseLinkedList {
    public static void main(String[] args) {
        Solution206 solution = new Solution206();
        Solution206.ListNode head1 = new Solution206.ListNode(1);
        head1.next = new Solution206.ListNode(2);
        head1.next.next = new Solution206.ListNode(3);
        head1.next.next.next = new Solution206.ListNode(4);
        head1.next.next.next.next = new Solution206.ListNode(5);
        solution.printNode(solution.reverseList(head1));

    }
}
