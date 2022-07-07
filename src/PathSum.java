
class Solution112 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return check(root, 0, targetSum);
    }

    boolean check(TreeNode node, int sumV, int targetSum) {
        if (node == null) return false;

        sumV += node.val;
        if (node.left == null && node.right == null) {
            return sumV == targetSum;
        }

        return check(node.left, sumV, targetSum) || check(node.right, sumV, targetSum);

    }

}

public class PathSum {
}
