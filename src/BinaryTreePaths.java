import java.util.ArrayList;
import java.util.List;

class Solution257 {
    public static class TreeNode {
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

    List<String> result;

    public List<String> binaryTreePaths(TreeNode root) {
        result = new ArrayList<>();

        addPath(root, "");

        return result;
    }

    void addPath(TreeNode node, String path) {
        if (path.length() != 0) {
            path += "->" + node.val;
        } else {
            path = Integer.toString(node.val);
        }

        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        if (node.left != null) addPath(node.left, path);
        if (node.right != null) addPath(node.right, path);
    }

}

public class BinaryTreePaths {
}
