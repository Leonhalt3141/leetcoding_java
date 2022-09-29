import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution671 {
    public int findSecondMinimumValue(TreeNode root) {
        SortedSet<Integer> values = new TreeSet<>();
        check(root, values);
        if (values.size() == 1) return -1;
        Iterator<Integer> iterator = values.iterator();
        int first = iterator.next();
        int second = iterator.next();
        if (first == second) return -1;
        return second;
    }

    void check(TreeNode node, SortedSet<Integer> values) {
        if (node == null) return;

        values.add(node.val);
        check(node.left, values);
        check(node.right, values);
    }
}

public class SecondMinimumNodeInABinaryTree {
}
