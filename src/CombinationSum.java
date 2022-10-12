
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;


class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answers = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(answers, new ArrayList<>(), candidates, 0);

        return answers;
    }

    void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        }
        else {
            for (int i = start; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, i + 1);
                tempList.remove(tempList.size() - 1);
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
