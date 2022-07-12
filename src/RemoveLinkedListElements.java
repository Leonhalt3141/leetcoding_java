
class Solution203 {

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) return null;

        ListNode node = head.next;
        ListNode prev = head;
        ListNode answer = prev;

        while (node != null) {
            if (node.val == val) {
                node = node.next;
                prev.next = node;

            } else {
                prev = node;
                node = node.next;
            }
        }
        return answer;
    }
}

public class RemoveLinkedListElements {
}
