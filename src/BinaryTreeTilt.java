
class Solution563 {

    static class TreeNode {
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

    public int findTilt(TreeNode root) {
        return tiltNode(root);
    }

    int tiltNode(TreeNode node) {
        if (node == null) return 0;

        int leftValue = sumNode(node.left);
        int rightValue = sumNode(node.right);

        int tilt = Math.abs(leftValue - rightValue);

        return tilt + tiltNode(node.left) + tiltNode(node.right);
    }

    int sumNode(TreeNode node) {
        if (node == null) return 0;
        return node.val + sumNode(node.left) + sumNode(node.right);
    }
}

public class BinaryTreeTilt {
}
