
import java.util.ArrayList;
import java.util.List;

class Solution113 {

    public static class TreeNode {
        int val;
        Solution113.TreeNode left;
        Solution113.TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, Solution113.TreeNode left, Solution113.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    List<List<Integer>> answer;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        answer = new ArrayList<>();

        if (root == null) return answer;

        List<Integer> comb = new ArrayList<>();

        createComb(targetSum, 0, comb, root);

        return answer;

    }

    void createComb(int targetSum, int proceed, List<Integer> comb, TreeNode node) {
        if (node == null) return;

        comb.add(node.val);
        proceed += node.val;
        if (node.left == null && node.right == null && proceed == targetSum) {
            answer.add(new ArrayList<>(comb));
            return;
        } else {
            createComb(targetSum, proceed, comb, node.left);
            createComb(targetSum, proceed, comb, node.right);
        }

        comb.remove(comb.size() - 1);
    }

    void printCombs(List<List<Integer>> combs) {
        for (List<Integer> comb : combs) {
            System.out.println(comb.toString() + ", ");
        }
        System.out.println("");
    }

}

public class PathSum2 {
    public static void main(String[] args) {
        Solution113 solution = new Solution113();

        Solution113.TreeNode root2 = new Solution113.TreeNode(1, new Solution113.TreeNode(2), new Solution113.TreeNode(3));

        solution.printCombs(solution.pathSum(root2, 4));

    }
}
