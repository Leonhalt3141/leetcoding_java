
class Solution24 {
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = curr;
            if (prev == null) head = next;
            else prev.next = next;

            prev = curr;
            curr = curr.next;

        }
        return head;
    }

    void swapTraverse(ListNode node, int index) {
        if (node == null || node.next == null) return;

        if (index % 2 == 1) {
            swap(node);
        }
        swapTraverse(node.next, index + 1);
    }

    void swap(ListNode node) {
        ListNode next = node.next;
        ListNode next_next = node.next.next;
        ListNode prev = node;

        node = next;
        node.next = prev;
        prev.next.next = next_next;
    }
}

public class SwapNodesInPairs {
}
