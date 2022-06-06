import java.util.ArrayList;
import java.util.List;

class Solution46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();

        createCombination(answer, nums, 0, nums.length - 1);

        return answer;
    }

    void createCombination(List<List<Integer>> answer, int[] nums, int start, int end) {
        if (start >= end) {
            List<Integer> comb = new ArrayList<>();
            for (int num : nums) comb.add(num);

            answer.add(comb);
        } else {
            for (int i = start; i <= end; i ++) {
                swap(nums, start, i);
                createCombination(answer, nums, start + 1, end);
                swap(nums, start, i);
            }
        }

    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    void printAnswer(List<List<Integer>> answer) {
        for (List<Integer> integers : answer) {
            System.out.print(integers.toString() + " ");
        }
    }

}

public class Permutations {
    public static void main(String[] args) {
        Solution46 solution = new Solution46();

        int[] nums1 = new int[]{1, 2, 3};

        solution.printAnswer(solution.permute(nums1));

    }
}
