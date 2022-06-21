
import javax.swing.tree.TreeNode;

class Solution98 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isValidBST(TreeNode root) {
        TreeNode left = null;
        TreeNode right = null;
        return isValidBST(root, left, right);
    }

    public boolean isValidBST(TreeNode root, TreeNode left, TreeNode right) {
        if (root == null) return true;

        if (left != null && left.val >= root.val) return false;

        if (right != null && right.val <= root.val) return false;

        return isValidBST(root.left, left, root) && isValidBST(root.right, root, right);
    }


}

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        Solution98 solution = new Solution98();

        Solution98.TreeNode root1 = new Solution98.TreeNode(2, new Solution98.TreeNode(1), new Solution98.TreeNode(3));
        System.out.println(solution.isValidBST(root1));

        Solution98.TreeNode root2 = new Solution98.TreeNode(5, new Solution98.TreeNode(4),
                new Solution98.TreeNode(6, new Solution98.TreeNode(3), new Solution98.TreeNode(7)));
        System.out.println(solution.isValidBST(root2));

        Solution98.TreeNode root3 = new Solution98.TreeNode(1, new Solution98.TreeNode(1), null);

        System.out.println(solution.isValidBST(root3));

        Solution98.TreeNode root4 = new Solution98.TreeNode(2, new Solution98.TreeNode(2), new Solution98.TreeNode(2));

        System.out.println(solution.isValidBST(root4));

    }
}
