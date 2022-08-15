import java.util.*;

class Solution501 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    HashMap<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {
        check(root);

        int max_count = Integer.MIN_VALUE;

        Queue<Integer> modeValues = new ArrayDeque<>();

        for (int key : map.keySet()) {
            int count = map.get(key);
            if (map.get(key) == max_count) {
                modeValues.add(key);
                max_count = count;
            } else if (map.get(key) > max_count) {
                modeValues.clear();
                modeValues.add(key);
                max_count = count;
            }
        }
        int size = modeValues.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) answer[i] = modeValues.poll();
        return answer;

    }

    void check(TreeNode node) {

        if (node == null) {
            return;
        }

        map.put(node.val, map.getOrDefault(node.val, 0) + 1);

        check(node.left);
        check(node.right);

    }
}

public class FindModeInBinarySearchTree {
}
