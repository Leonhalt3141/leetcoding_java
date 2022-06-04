import java.util.PriorityQueue;

class Solution23 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public ListNode mergeKLists(ListNode[] lists) {

        int k = lists.length;
        if (k == 0) return null;
        else if (k == 1) return mergeTwoLists(lists[0], null);
        ListNode answer;

        answer = lists[0];

        for (int i=1; i<k; i++) {
            answer = mergeTwoLists(answer, lists[i]);
        }
        return answer;
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        else if (list1 != null && list2 == null) return list1;
        else if (list1 == null) return list2;
        else {
            if (list1.val <= list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
    }

    public ListNode mergeKLists2(ListNode[] lists) {

        if (lists.length == 0) return null;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (ListNode list : lists) {
            ListNode head = list;
            while (head != null) {
                queue.add(head.val);
                head = head.next;
            }
        }
        return getNode(queue);
    }

    private ListNode getNode(PriorityQueue<Integer> queue) {
        if (!queue.isEmpty()) {
            ListNode node = new ListNode(queue.poll());
            node.next = getNode(queue);
            return node;
        }
        return null;
    }

    public void printNode(ListNode node){
        if (node != null) {
            System.out.print(node.val + " ");
            printNode(node.next);
        }
        System.out.println();
    }
}

public class MergeKSortedLists {
    public static void main(String[] args) {
        Solution23 solution = new Solution23();

        Solution23.ListNode[] lists1 = new Solution23.ListNode[] {
                new Solution23.ListNode(1,
                        new Solution23.ListNode(4,
                                new Solution23.ListNode(5))),
                new Solution23.ListNode(1,
                        new Solution23.ListNode( 3,
                                new Solution23.ListNode(4))),
                new Solution23.ListNode(2,
                        new Solution23.ListNode(6))
        };

        solution.printNode(solution.mergeKLists2(lists1));

        Solution23.ListNode[] lists2 = new Solution23.ListNode[]{};
        solution.printNode(solution.mergeKLists(lists2));

        Solution23.ListNode[] lists3 = new Solution23.ListNode[]{new Solution23.ListNode(){}};
        solution.printNode(solution.mergeKLists(lists3));
    }
}
