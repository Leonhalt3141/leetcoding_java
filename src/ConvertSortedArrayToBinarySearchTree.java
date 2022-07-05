
class Solution108 {
    static class TreeNode {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode();
        root = leftSideBT(root, nums, 0, nums.length - 1);
        return root;
    }

    TreeNode leftSideBT(TreeNode node, int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = ((right - left) % 2 == 1) ? (right - left) / 2 + left + 1 : (right - left) / 2 + left;
        node.val = nums[mid];

        TreeNode leftNode = new TreeNode();
        node.left = leftSideBT(leftNode, nums, left, mid - 1);

        TreeNode rightNode = new TreeNode();
        node.right = leftSideBT(rightNode, nums, mid + 1, right);

        return node;
    }

    void printNode(TreeNode node) {
        if (node == null) {
            System.out.print("null, ");
            return;
        }
        System.out.print(node.val + ", ");
        printNode(node.left);
        printNode(node.right);
    }

}

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        Solution108 solution = new Solution108();

        int[] nums1 = new int[]{-10,-3,0,5,9};
        solution.printNode(solution.sortedArrayToBST(nums1));
    }
}
