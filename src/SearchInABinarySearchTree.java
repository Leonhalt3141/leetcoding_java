
class Solution700 {

    TreeNode target = null;

    public TreeNode searchBST(TreeNode root, int val) {
        search(root, val);
        return target;
    }

    void search(TreeNode node, int val) {
        if (node == null) {
            return;
        }

        if (node.val == val) {
            target = node;
        }

        search(node.left, val);
        search(node.right, val);
    }

    TreeNode searchBST_(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        else if (root.val > val) return searchBST(root.left, val);
        return searchBST(root.right, val);
    }


}

public class SearchInABinarySearchTree {
}
