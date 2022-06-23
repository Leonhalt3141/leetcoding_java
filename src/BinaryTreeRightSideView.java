import java.util.*;

class Solution199 {
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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightValues = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return rightValues;

        queue.offer(root);

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            rightValues.add(queue.peek().val);

            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();

                if (node.right != null) {
                    queue.add(node.right);
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
            }
        }

        return rightValues;
    }


}

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        Solution199 solution = new Solution199();

        Solution199.TreeNode root1 = new Solution199.TreeNode(1,
                new Solution199.TreeNode(2, null, new Solution199.TreeNode(5)),
                new Solution199.TreeNode(3, null, new Solution199.TreeNode(4)));
        System.out.println(solution.rightSideView(root1).toString());

        Solution199.TreeNode root2 = new Solution199.TreeNode(1, new Solution199.TreeNode(2), null);
        System.out.println(solution.rightSideView(root2).toString());

        Solution199.TreeNode root3 = new Solution199.TreeNode(1,
                new Solution199.TreeNode(2, new Solution199.TreeNode(4), null),
                new Solution199.TreeNode(3));
        System.out.println(solution.rightSideView(root3).toString());


    }
}
