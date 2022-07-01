
class Solution83 {

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode deleteDuplicates(ListNode head) {
         if (head == null) return head;

         int value = head.val;
         ListNode prev = head;
         ListNode node = head.next;

         while (node != null) {
             if (value != node.val) {
                 prev = node;
                 node = node.next;
                 value = prev.val;
             } else {
                 prev.next = node.next;
                 node = node.next;
             }
         }
         return head;
    }


}

public class RemoveDuplicatesFromSortedList {
}
