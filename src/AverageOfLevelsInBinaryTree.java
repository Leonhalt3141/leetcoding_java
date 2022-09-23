import java.util.ArrayList;
import java.util.List;

class Solution637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> answer = new ArrayList<>();
        List<Integer> count = new ArrayList<>();

        average(root, 0, answer, count);

        for (int i = 0; i < answer.size(); i++) {
            answer.set(i, answer.get(i) / count.get(i));
        }

        return answer;
    }

    void average(TreeNode node, int i, List<Double> answer, List<Integer> count) {
        if (node == null) return;

        if (i < answer.size()) {
            answer.set(i, answer.get(i) + node.val);
            count.set(i, count.get(i) + 1);
        } else {
            answer.add(1.0 * node.val);
            count.add(1);
        }

        average(node.left, i + 1, answer, count);
        average(node.right, i + 1, answer, count);

    }


}

public class AverageOfLevelsInBinaryTree {
}
