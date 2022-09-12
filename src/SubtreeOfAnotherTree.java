
class Solution572 {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return checkSubRoot(root, subRoot);
    }

    boolean checkSubRoot(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        if (root.val == subRoot.val) if (checkIdentical(root, subRoot)) return true;

        return checkSubRoot(root.left, subRoot) | checkSubRoot(root.right, subRoot);

    }

    boolean checkIdentical(TreeNode root, TreeNode subRoot) {
        if (root == null & subRoot == null) return true;
        if (root == null | subRoot == null) return false;
        if (root.val != subRoot.val) return false;

        return checkIdentical(root.left, subRoot.left) & checkIdentical(root.right, subRoot.right);

    }

}

public class SubtreeOfAnotherTree {
}
