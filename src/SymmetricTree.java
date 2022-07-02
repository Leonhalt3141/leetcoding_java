
class Solution101 {
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

    public boolean isSymmetric(TreeNode root) {
        return checkNodes(root.left, root.right);
    }

    boolean checkNodes(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) return true;
        else if (leftNode == null || rightNode == null) return false;
        else if (leftNode.val != rightNode.val) return false;
        return checkNodes(leftNode.left, rightNode.right) && checkNodes(leftNode.right, rightNode.left);
    }

}

public class SymmetricTree {
}
