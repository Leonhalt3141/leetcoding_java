
class Solution226 {

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

    public TreeNode invertTree(TreeNode root) {
        invertNode(root);
        return root;
    }

    void invertNode(TreeNode node) {
        if (node == null) return;

        TreeNode left = node.left;

        node.left = node.right;
        invertTree(node.left);

        node.right = left;
        invertNode(node.right);

    }
}

public class InvertBinaryTree {
}
