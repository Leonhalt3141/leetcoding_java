import java.util.ArrayList;
import java.util.List;

class Solution590 {
    public List<Integer> postorder(Node root) {
       List<Integer> answer = new ArrayList<>();
       traverseRecursively(root, answer);
       return answer;
    }

    void traverseRecursively(Node root, List<Integer> answer) {
        if (root == null) return;
        if (root.children != null) {
            root.children.forEach(child -> traverseRecursively(child, answer));
        }
        answer.add(root.val);
    }
}

public class NaryTreePostorderTraversal {
}
