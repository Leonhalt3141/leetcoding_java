
class Solution617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }

    TreeNode merge(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return null;

        if (node1 != null) {
            node1.val = (node2 != null) ? node1.val + node2.val : node1.val;

            node2 = (node2 != null) ? node2 : new TreeNode();

            node1.left = merge(node1.left, node2.left);
            node1.right = merge(node1.right, node2.right);
        } else {
            node1 = node2;
        }

        return node1;
    }
}

public class MergeTwoBinaryTrees {
}
