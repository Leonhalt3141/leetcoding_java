import java.util.ArrayList;
import java.util.List;

class Solution100 {

    static class TreeNode {
        int val;
        Solution100.TreeNode left;
        Solution100.TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, Solution100.TreeNode left, Solution100.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;

        if (q == null || p == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }


}

public class SameTree {
    public static void main(String[] args) {
        Solution100 solution = new Solution100();

        Solution100.TreeNode p1 = new Solution100.TreeNode(1,
                new Solution100.TreeNode(2), new Solution100.TreeNode(3));
        Solution100.TreeNode q1 = new Solution100.TreeNode(1,
                new Solution100.TreeNode(2), new Solution100.TreeNode(3));
        System.out.println(solution.isSameTree(p1, q1));

        Solution100.TreeNode p2 = new Solution100.TreeNode(1,
                new Solution100.TreeNode(2), null);
        Solution100.TreeNode q2 = new Solution100.TreeNode(1,
                null, new Solution100.TreeNode(2));
        System.out.println(solution.isSameTree(p2, q2));

        Solution100.TreeNode p3 = new Solution100.TreeNode(1,
                new Solution100.TreeNode(2), new Solution100.TreeNode(1));
        Solution100.TreeNode q3 = new Solution100.TreeNode(1,
                new Solution100.TreeNode(1), new Solution100.TreeNode(2));
        System.out.println(solution.isSameTree(p3, q3));

        Solution100.TreeNode p4 = new Solution100.TreeNode();
        Solution100.TreeNode q4 = new Solution100.TreeNode();
        System.out.println(solution.isSameTree(p4, q4));

        Solution100.TreeNode p5 = new Solution100.TreeNode(1,
                null, new Solution100.TreeNode(2,
                new Solution100.TreeNode(3), null));
        Solution100.TreeNode q5 = new Solution100.TreeNode(1,
                null, new Solution100.TreeNode(2,
                null, new Solution100.TreeNode(3)));
        System.out.println(solution.isSameTree(p5, q5));

        Solution100.TreeNode p6 = new Solution100.TreeNode();
        Solution100.TreeNode q6 = new Solution100.TreeNode();
        System.out.println(solution.isSameTree(p6, q6));

        Solution100.TreeNode p7 = null;
        Solution100.TreeNode q7 = new Solution100.TreeNode(0);
        System.out.println(solution.isSameTree(p7, q7));
    }
}
