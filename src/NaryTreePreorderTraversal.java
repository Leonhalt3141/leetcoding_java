import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution589 {
    public List<Integer> preorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) return answer;

        Stack<Node> stack = new Stack<>();

        answer.add(root.val);

        for (int i = root.children.size() - 1; i >= 0; i--) {
            stack.add(root.children.get(i));
        }

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            answer.add(node.val);
            for (int i = node.children.size() - 1; i >= 0; i--) {
                stack.add(node.children.get(i));
            }
        }

        return answer;
    }
}

public class NaryTreePreorderTraversal {
}
