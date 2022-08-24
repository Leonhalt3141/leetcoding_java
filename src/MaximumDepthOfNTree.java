import java.util.List;

class Solution559 {

    static class Node {
        int val;
        List<Node> children;
        Node() {}
        Node(int _val) {val = _val;}


        Node (int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        if (root == null) return 0;

        int max = 0;

        for (Node n : root.children) {
            max = Integer.max(max, maxDepth(n));
        }

        return 1 + max;

    }

}

public class MaximumDepthOfNTree {
}
