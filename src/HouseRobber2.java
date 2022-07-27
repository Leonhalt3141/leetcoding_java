import java.util.Arrays;

class Solution213 {
    public int rob(int[] nums) {

        int size = nums.length;

        if (size == 1) return nums[0];

        int value1 = calc(Arrays.copyOfRange(nums, 0, size - 1));
        int value2 = calc(Arrays.copyOfRange(nums, 1, size));

        return Integer.max(value1, value2);
    }

    int calc(int[] nums) {
        int pre = 0;
        int cur = 0;

        for (int num : nums) {
            int temp = Integer.max(pre + num, cur);
            pre = cur;
            cur = temp;
        }
        return cur;
    }

}

public class HouseRobber2 {
    public static void main(String[] args) {
        Solution213 solution = new Solution213();

        int[] nums1 = new int[]{2, 3, 2};
        System.out.println(solution.rob(nums1));

        int[] nums2 = new int[]{1, 2, 3, 1};
        System.out.println(solution.rob(nums2));

        int[] nums3 = new int[]{1, 2, 3};
        System.out.println(solution.rob(nums3));
    }
}
