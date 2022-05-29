

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {this.val = val; this.next = next; }
}

class SolutionListNode {

    public ListNode createNodesFromList(int[] list) {
        ListNode firstNode = new ListNode();
        firstNode.val = list[0];

        if (list.length > 1) {
            ListNode currentNode = new ListNode();
            currentNode.val = list[1];
            firstNode.next = currentNode;
            ListNode prevNode = currentNode;

            for (int i = 2; i < list.length; i++) {
                currentNode = new ListNode();
                currentNode.val = list[i];
                prevNode.next = currentNode;

                prevNode = currentNode;
            }
        }
        return firstNode;
    }

    public ListNode createNodeFromString(String stringValue) {
        ListNode firstNode = new ListNode();
        int stringSize = stringValue.length();
        firstNode.val = Integer.parseInt(stringValue.substring(stringSize-1, stringSize));

        if (stringSize > 1) {
            ListNode currentNode = new ListNode();
            currentNode.val = Integer.parseInt(stringValue.substring(stringSize-2, stringSize-1));
            firstNode.next = currentNode;
            ListNode prevNode = currentNode;

            for (int i = 2; i < stringSize; i++) {
                currentNode = new ListNode();
                currentNode.val = Integer.parseInt(stringValue.substring(stringSize-(i+1), stringSize-i));

                prevNode.next = currentNode;
                prevNode = currentNode;
            }
        }
        return firstNode;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode firstNode = new ListNode(0);
        ListNode node1 = l1, node2 = l2, current = firstNode;
        int roundUp = 0;

        while (node1 != null || node2 != null) {
            int value1 = (node1 != null) ? node1.val : 0;
            int value2 = (node2 != null) ? node2.val : 0;

            int sumValue = value1 + value2 + roundUp;
            roundUp = sumValue / 10;
            current.next = new ListNode(sumValue % 10);
            current = current.next;

            if (node1 != null) node1 = node1.next;
            if (node2 != null) node2 = node2.next;
        }

        if (roundUp > 0) current.next = new ListNode(roundUp);

        return firstNode.next;

//        StringBuilder buf = new StringBuilder();
//
//        int digitTotal = l1.val +  l2.val;
//
//        int roundUp = 0;
//
//        if (digitTotal > 9) {
//            buf.append(digitTotal - 10);
//            roundUp = 1;
//        } else buf.append(digitTotal);
//
//        ListNode node1 = l1.next;
//        ListNode node2 = l2.next;
//
//        while (node1 != null || node2 != null) {
//
//            int value1 = 0;
//            int value2 = 0;
//
//            if (node1 != null) {
//                value1 = node1.val;
//                node1 = node1.next;
//            }
//            if (node2 != null) {
//                value2 = node2.val;
//                node2 = node2.next;
//            }
//
//            digitTotal = value1 + value2 + roundUp;
//
//            if (digitTotal > 9) {
//                buf.insert(0, digitTotal - 10);
//                roundUp = 1;
//            }
//            else {
//                buf.insert(0, digitTotal);
//                roundUp = 0;
//            }
//
//        }
//
//        if (roundUp > 0) buf.insert(0, 1);
//
//        return createNodeFromString(buf.toString());
    }

    void printNodeValues(ListNode node) {
        StringBuilder buf = new StringBuilder();
        ListNode current = node;

        while (current != null) {
            buf.append(current.val).append(", ");
            current = current.next;
        }
        System.out.println(buf);
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] l1_1 = new int[]{2, 4, 3};
        int[] l2_1 = new int[]{5, 6, 4};

        SolutionListNode solution = new SolutionListNode();

        ListNode l1Node1 = solution.createNodesFromList(l1_1);
        ListNode l2Node1 = solution.createNodesFromList(l2_1);

        ListNode answerNode1 = solution.addTwoNumbers(l1Node1, l2Node1);
        solution.printNodeValues(answerNode1);

        int[] l1_2 = new int[]{0};
        int[] l2_2 = new int[]{0};

        ListNode l1Node2 = solution.createNodesFromList(l1_2);
        ListNode l2Node2 = solution.createNodesFromList(l2_2);

        ListNode answerNode2 = solution.addTwoNumbers(l1Node2, l2Node2);
        solution.printNodeValues(answerNode2);

        int[] l1_3 = new int[]{9,9,9,9,9,9,9};
        int[] l2_3 = new int[]{9,9,9,9};

        ListNode l1Node3 = solution.createNodesFromList(l1_3);
        ListNode l2Node3 = solution.createNodesFromList(l2_3);

        ListNode answerNode3 = solution.addTwoNumbers(l1Node3, l2Node3);
        solution.printNodeValues(answerNode3);


        int[] l1 = new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int[] l2 = new int[]{5,6,4};

        ListNode l1Node = solution.createNodesFromList(l1);
        ListNode l2Node = solution.createNodesFromList(l2);

        ListNode answerNode = solution.addTwoNumbers(l1Node, l2Node);
        solution.printNodeValues(answerNode);

    }
}
