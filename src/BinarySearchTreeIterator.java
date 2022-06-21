import java.util.PriorityQueue;

class BSTIterator {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    PriorityQueue<Integer> queue;

    public BSTIterator(TreeNode root) {
        queue = new PriorityQueue<>();
        setQueue(root);
    }

    void setQueue(TreeNode node) {
        if (node == null) return;

        queue.add(node.val);
        setQueue(node.left);
        setQueue(node.right);
    }

    public int next() {
        return (queue.isEmpty()) ? -1 : queue.poll();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}

public class BinarySearchTreeIterator {
    public static void main(String[] args) {


        BSTIterator.TreeNode root = new BSTIterator.TreeNode(7, new BSTIterator.TreeNode(3, null, null),
                new BSTIterator.TreeNode(15, new BSTIterator.TreeNode(9, null, null), new BSTIterator.TreeNode(20, null, null)));
        BSTIterator bs = new BSTIterator(root);

        System.out.println(bs.next());
        System.out.println(bs.next());
        System.out.println(bs.hasNext());
        System.out.println(bs.next());
        System.out.println(bs.hasNext());
        System.out.println(bs.next());
        System.out.println(bs.hasNext());
        System.out.println(bs.next());
        System.out.println(bs.hasNext());
    }
}
