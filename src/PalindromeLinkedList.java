import java.util.*;

class Solution234 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();

        ListNode node = head;
        int size = confirmSize(head);

        if (size == 1) return true;

        boolean even = size % 2 == 0;
        int oneSideSize = size / 2;

        Stack<Integer> left = new Stack<>();

        int index = 0;

        while (index < size) {
            if (index < oneSideSize) left.add(node.val);
            else {
                if (even) {
                    if (node.val != left.pop()) return false;
                } else {
                    if (index > oneSideSize) {
                        if (node.val != left.pop()) return false;
                    }
                }
            }

            node = node.next;
            index++;
        }
        return true;

    }

    int confirmSize(ListNode node) {
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    public boolean isPalindromeA(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) slow = slow.next;
        slow = reverse(slow);
        fast = head;

        while (slow != null && fast != null) {
            if (slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;

    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Solution234 solution = new Solution234();

        Solution234.ListNode head1 = new Solution234.ListNode(1);
        head1.next = new Solution234.ListNode(2);
        head1.next.next = new Solution234.ListNode(2);
        head1.next.next.next = new Solution234.ListNode(1);
        System.out.println(solution.isPalindromeA(head1));

        Solution234.ListNode head2 = new Solution234.ListNode(1);
        head2.next = new Solution234.ListNode(2);
        head2.next.next = new Solution234.ListNode(3);
        head2.next.next.next = new Solution234.ListNode(2);
        head2.next.next.next.next = new Solution234.ListNode(1);
        System.out.println(solution.isPalindrome(head2));

        Solution234.ListNode head3 = new Solution234.ListNode(1);
        head3.next = new Solution234.ListNode(2);
        head3.next.next = new Solution234.ListNode(3);
        head3.next.next.next = new Solution234.ListNode(2);
        head3.next.next.next.next = new Solution234.ListNode(9);
        System.out.println(solution.isPalindrome(head3));

        Solution234.ListNode head4 = new Solution234.ListNode(1);
        head4.next = new Solution234.ListNode(2);
        System.out.println(solution.isPalindrome(head4));
    }
}
