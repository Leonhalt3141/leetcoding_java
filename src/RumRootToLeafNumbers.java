import java.util.ArrayList;
import java.util.List;

class Solution129 {

    static class TreeNode {
        int val;
        Solution129.TreeNode left;
        Solution129.TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, Solution129.TreeNode left, Solution129.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int sumNumbers(TreeNode root) {
        List<Integer> numbers = new ArrayList<>();
        calcNumbers(root, 0, numbers);

        int sum = 0;
        for (int number : numbers) sum = sum + number;
        return sum;
    }

    void calcNumbers(TreeNode node, int number, List<Integer> numbers) {
        if (node == null) {
            numbers.add(number);
            return;
        }

        number = (number * 10) + node.val;
        if (node.left != null && node.right != null) {
            calcNumbers(node.right, number, numbers);
            calcNumbers(node.left, number, numbers);
        } else if (node.left == null && node.right == null) {
            numbers.add(number);
            return;
        }

        if (node.left == null) calcNumbers(node.right, number, numbers);

        if (node.right == null) calcNumbers(node.left, number, numbers);
    }

    public int sumNumbers2(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode node, int number) {
        if (node == null) return 0;
        if (node.right == null && node.left == null) return number * 10 + node.val;
        return sum(node.left, number * 10 + node.val) + sum(node.right, number * 10 + node.val);
    }

}

public class RumRootToLeafNumbers {
    public static void main(String[] args) {
        Solution129 solution = new Solution129();

        Solution129.TreeNode root1 = new Solution129.TreeNode(1, new Solution129.TreeNode(2, null, null), new Solution129.TreeNode(3, null, null));
        System.out.println(solution.sumNumbers(root1));

        Solution129.TreeNode root2 = new Solution129.TreeNode(4,
                new Solution129.TreeNode(9, new Solution129.TreeNode(5), new Solution129.TreeNode(1)),
                new Solution129.TreeNode(0, null, null));
        System.out.println(solution.sumNumbers(root2));

        Solution129.TreeNode root3 = new Solution129.TreeNode(1, new Solution129.TreeNode(0, null, null), null);
        System.out.println(solution.sumNumbers(root3));

    }
}
