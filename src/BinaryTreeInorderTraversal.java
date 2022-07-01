import java.util.ArrayList;
import java.util.List;

class Solution94 {
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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        append(root, answer);
        return answer;
    }

    void append(TreeNode node, List<Integer> answer) {
        if (node == null) return;

        append(node.left, answer);
        answer.add(node.val);
        append(node.right, answer);
    }


}

public class BinaryTreeInorderTraversal {
}
