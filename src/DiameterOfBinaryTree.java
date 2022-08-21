
class Solution543 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode () {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        count(root);

        return max;
    }

    int count(TreeNode node) {
        if (node == null) return 0;

        int left = count(node.left);
        int right = count(node.right);

        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}

public class DiameterOfBinaryTree {
}
