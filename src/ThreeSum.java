import java.util.*;

/**
 * https://leetcode.com/problems/3sum/
 */

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answers = new ArrayList<>();
        int size = nums.length;
        if (size < 3) return answers;

        Arrays.sort(nums);

        for (int index1 = 0; index1 < size - 2; index1++) {
            if (index1 > 0 && nums[index1] == nums[index1-1]) {
                continue;
            }
            int index2 = index1 + 1;
            int index3 = size - 1;

            while (index2 < index3) {
                int sum = nums[index1] + nums[index2] + nums[index3];
                if (sum == 0) {
                    answers.add(Arrays.asList(nums[index1], nums[index2], nums[index3]));
                    index3--;

                    while (index2 < index3 && nums[index3] == nums[index3+1]) index3--;
                } else if (sum > 0) {
                    index3--;
                } else {
                    index2++;
                }
            }
        }

        return answers;
    }
}

public class ThreeSum {
    public static void main(String[] args) {
        Solution15 solution = new Solution15();

        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(solution.threeSum(nums));

    }

}
