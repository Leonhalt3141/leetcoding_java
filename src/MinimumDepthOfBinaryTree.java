
class Solution111 {

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

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        else {
            return height(root);
        }

    }

    int height (TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;

        if (root.left == null && root.right == null) {
            return 1;
        }

        return Math.min(height(root.left), height(root.right)) + 1;
    }

}

public class MinimumDepthOfBinaryTree {
}
