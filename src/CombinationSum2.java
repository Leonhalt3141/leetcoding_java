import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(answer, new ArrayList<>(), candidates, 0, target);
        return answer;
    }

    void backtrack(List<List<Integer>> answer, List<Integer> comb, int[] candidates, int start, int remain) {
        if (remain == 0) {
            answer.add(new ArrayList<>(comb));
        } else {
            for (int i = start; i < candidates.length; i++) {
                int value = candidates[i];

                if (i > start && value == candidates[i - 1]) continue;

                if (remain - value < 0) break;

                comb.add(value);

                backtrack(answer, comb, candidates, i + 1, remain - value);
                comb.remove(comb.size() - 1);
            }
        }
    }
}

public class CombinationSum2 {
    public static void main(String[] args) {
        Solution40 solution = new Solution40();

        System.out.println(solution.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));

        System.out.println(solution.combinationSum2(new int[]{2,5,2,1,2}, 5));
    }
}
