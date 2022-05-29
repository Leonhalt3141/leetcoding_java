import java.sql.Array;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum/
 */

class Solution {
    boolean check(int a1, int a2, int target) {
        return a1 + a2 == target;
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int a1 = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                int a2 = nums[j];

                if (check(a1, a2, target)) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2,7,11,15};
        int target1 = 9;

        int[] nums2 = new int[]{3,2,4};
        int target2 = 6;

        int[] nums3 = new int[]{3,3};
        int target3 = 6;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.twoSum(nums1, target1)));
        System.out.println(Arrays.toString(solution.twoSum(nums2, target2)));
        System.out.println(Arrays.toString(solution.twoSum(nums3, target3)));

    }
}
