
class Solution160 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode (int x) {
            val = x;
            next = null;
        }
    }

    public ListNode intersectNode;

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        intersectNode = null;

        int headASize = getSize(headA);
        int headBSize = getSize(headB);

        ListNode nodeA = headA;
        ListNode nodeB = headB;

        if (headASize < headBSize) {
            for (int i = 0; i < headBSize - headASize; i++) {
                nodeB = nodeB.next;
            }
        } else {
            for (int i = 0; i < headASize - headBSize; i++){
                nodeA = nodeA.next;
            }
        }

//        while (nodeA != null && nodeB != null) {
//            intersectNode = nodeA;
//
//            if (checkIdentical(nodeA, nodeB)) {
//                break;
//            }
//            intersectNode = null;
//            nodeA = nodeA.next;
//            nodeB = nodeB.next;
//        }

        while (nodeA != null && nodeB != null) {
            if (nodeA == nodeB) return nodeA;
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return null;
//        return intersectNode;
    }

    boolean checkIdentical(ListNode node1, ListNode node2) {
        while (node1 != null && node2 !=null) {
            if (node1.val != node2.val) return false;
            node1 = node1.next;
            node2 = node2.next;
        }
        return true;
    }

    int getSize(ListNode node) {
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

}

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        Solution160 solution = new Solution160();

        Solution160.ListNode headA1 = new Solution160.ListNode(4);
        headA1.next = new Solution160.ListNode(1);
        headA1.next.next = new Solution160.ListNode(8);
        headA1.next.next.next = new Solution160.ListNode(4);
        headA1.next.next.next.next = new Solution160.ListNode(5);

        Solution160.ListNode headB1 = new Solution160.ListNode(5);
        headB1.next = new Solution160.ListNode(6);
        headB1.next.next = new Solution160.ListNode(1);
        headB1.next.next.next = new Solution160.ListNode(8);
        headB1.next.next.next.next = new Solution160.ListNode(4);
        headB1.next.next.next.next.next = new Solution160.ListNode(5);

        System.out.println(solution.getIntersectionNode(headA1, headB1).val);


        Solution160.ListNode headA2 = new Solution160.ListNode(1);
        headA2.next = new Solution160.ListNode(9);
        headA2.next.next = new Solution160.ListNode(1);
        headA2.next.next.next = new Solution160.ListNode(2);
        headA2.next.next.next.next = new Solution160.ListNode(4);

        Solution160.ListNode headB2 = new Solution160.ListNode(3);
        headB2.next = new Solution160.ListNode(2);
        headB2.next.next = new Solution160.ListNode(4);

        System.out.println(solution.getIntersectionNode(headA2, headB2).val);

    }
}
