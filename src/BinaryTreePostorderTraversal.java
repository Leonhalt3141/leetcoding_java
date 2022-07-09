import java.util.*;

class Solution145 {

    public class TreeNode {
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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();

        traverse(root, result);
        return result;
    }

    void traverse(TreeNode node, List<Integer> result) {
        if (node == null) return;

        traverse(node.left, result);
        traverse(node.right, result);
        result.add(node.val);

    }

    public List<Integer> postorderTraversalA(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) return result;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();

            if (node.left != null) stack1.push(node.left);
            if (node.right != null) stack1.push(node.right);
            stack2.push(node);
        }

        while(!stack2.isEmpty()) result.add(stack2.pop().val);

        return result;
    }

}

public class BinaryTreePostorderTraversal {
}
