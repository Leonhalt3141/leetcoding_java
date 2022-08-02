import java.util.List;

class Solution404 {


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

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        sumTree(root, false);
        return sum;
    }

    void sumTree(TreeNode node, boolean isLeft) {
        if (node == null) {
            return;
        } else if (node.left == null && node.right == null && isLeft) {
             sum += node.val;
             return;
         }

         sumTree(node.left, true);
         sumTree(node.right, false);
    }
}

public class SumOfLeftLeaves {
}
