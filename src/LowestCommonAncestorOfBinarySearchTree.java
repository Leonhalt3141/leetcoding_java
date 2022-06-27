
class Solution235 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int min = Math.min(p.val, q.val);
        int max = Math.max(p.val, q.val);

        while (true) {
            if (root.val < min) {
                root = root.right;
            } else if (root.val > max) {
                root = root.left;
            } else {
                return root;
            }
        }
    }

}

public class LowestCommonAncestorOfBinarySearchTree {
}
