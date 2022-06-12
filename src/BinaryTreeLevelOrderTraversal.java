
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution102 {

    public static class TreeNode {
        int val;
        Solution102.TreeNode left;
        Solution102.TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, Solution102.TreeNode left, Solution102.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    List<List<Integer>> answer;

    public List<List<Integer>> levelOrder(TreeNode root) {
        answer = new ArrayList<>();

        if (root == null) return answer;

        traversal(root, 0);

        return answer;
    }

    void traversal(TreeNode node, int height) {

        if (node == null) return;

        if (height >= answer.size()) {
            List<Integer> order = new ArrayList<Integer>();
            answer.add(order);
        }

        answer.get(height).add(node.val);
        traversal(node.left, height + 1);
        traversal(node.right, height + 1);
    }

    void printLevels(List<List<Integer>> levels) {
        for (List<Integer> level : levels) {
            System.out.print(level.toString() + ", ");
        }
        System.out.println("");
    }

}

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Solution102 solution = new Solution102();

        Solution102.TreeNode root1 = new Solution102.TreeNode(3, new Solution102.TreeNode(9), new Solution102.TreeNode(20,
                new Solution102.TreeNode(15), new Solution102.TreeNode(7)));

        solution.printLevels(solution.levelOrder(root1));

        Solution102.TreeNode root2 = new Solution102.TreeNode(1, new Solution102.TreeNode(2), null);

        solution.printLevels(solution.levelOrder(root2));

    }
}
