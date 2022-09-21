
class Solution606 {
    public String tree2str(TreeNode root) {
        StringBuilder answer = new StringBuilder();
        construct(root, answer);

        return answer.toString();
    }

    void construct(TreeNode node, StringBuilder answer) {

        if (node.left == null && node.right == null) {
            answer.append(node.val);
            return;
        }

        answer.append(node.val);
        answer.append("(");
        if (node.left != null) construct(node.left, answer);
        answer.append(")");

        if (node.right != null) {
            answer.append("(");
            construct(node.right, answer);
            answer.append(")");
        }
    }

}

public class ConstructStringFromBinaryTree {
}
