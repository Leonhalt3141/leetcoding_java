import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(answer, new ArrayList<>(), 0, candidates, target);
        return answer;
    }

    void backtrack(List<List<Integer>> answer, List<Integer> comb, int k, int[] candidates, int remain) {

        if (remain < 0) {
            return;
        } else if (remain == 0) {
            answer.add(new ArrayList<>(comb));
        } else {
            for (int i = k; i < candidates.length; i++) {
                comb.add(candidates[i]);
                backtrack(answer, comb, i, candidates, remain - candidates[i]);
                comb.remove(comb.size() - 1);
            }
        }
    }

}

public class CombinationSum {
    public static void main(String[] args) {
        Solution39 solution = new Solution39();

        System.out.println(solution.combinationSum(new int[]{2, 3, 6, 7}, 7));

        System.out.println(solution.combinationSum(new int[]{2, 3, 5}, 8));

        System.out.println(solution.combinationSum(new int[]{2}, 1));
    }
}
