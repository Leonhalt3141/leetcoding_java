
class Solution55 {
    public boolean canJump(int[] nums) {
        int last = nums.length - 1;
        for (int i = last - 1; i >= 0; i--) {
            if (i + nums[i] >= last) last = i;
        }
        return last <= 0;
    }
}

public class JumpGame {
    public static void main(String[] args) {
        Solution55 solution = new Solution55();

        int[] nums1 = new int[]{2, 3, 1, 1, 4};
        System.out.println(solution.canJump(nums1));

        int[] nums2 = new int[]{3, 2, 1, 0, 4};
        System.out.println(solution.canJump(nums2));

        int[] nums3 = new int[]{0};
        System.out.println(solution.canJump(nums3));
    }
}
