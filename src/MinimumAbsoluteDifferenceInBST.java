import java.util.PriorityQueue;

class Solution530 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    PriorityQueue<Integer> queue;

    public int getMinimumDifference(TreeNode root) {
        int diff = Integer.MAX_VALUE;
        int prevV = Integer.MIN_VALUE;
        queue = new PriorityQueue<>();
        load(root);

        while (!queue.isEmpty()) {
            int value = queue.poll();
            if (prevV != Integer.MIN_VALUE) diff = Integer.min(diff, Math.abs(value - prevV));
            prevV = value;
        }
        return diff;
    }

    void load(TreeNode node) {
        if (node == null) return;

        queue.add(node.val);

        load(node.left);
        load(node.right);
    }

}

public class MinimumAbsoluteDifferenceInBST {
}
