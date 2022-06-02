
class Solution21 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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

    void printNodes(ListNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            printNodes(node.next);
        } else System.out.println();

    }

}

public class Merge2SortedLists {
    public static void main(String[] args) {
        Solution21 solution = new Solution21();

        Solution21.ListNode list1_1 = new Solution21.ListNode(1,
                new Solution21.ListNode(2,
                        new Solution21.ListNode(4)));
        Solution21.ListNode list2_1 = new Solution21.ListNode(1,
                new Solution21.ListNode(3,
                        new Solution21.ListNode(4)));
        solution.printNodes(solution.mergeTwoLists(list1_1, list2_1));

        Solution21.ListNode list1_2 = null;
        Solution21.ListNode list2_2 = null;
        solution.printNodes(solution.mergeTwoLists(list1_2, list2_2));

        Solution21.ListNode list1_3 = null;
        Solution21.ListNode list2_3 = new Solution21.ListNode(0);
        solution.printNodes(solution.mergeTwoLists(list1_3, list2_3));

    }
}
