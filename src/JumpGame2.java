
class Solution45 {
    public int jump(int[] nums) {
        int max_reach = 0;
        int jumps = 0;
        int currentJumEnd = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            max_reach = Integer.max(max_reach, i + nums[i]);

            if (i == currentJumEnd) {
                jumps ++;
                currentJumEnd = max_reach;
            }
        }
        return jumps;
    }
}

public class JumpGame2 {
    public static void main(String[] args) {
        Solution45 solution = new Solution45();

        int[] nums1 = new int[] {2, 3, 1, 1, 4};
        System.out.println(solution.jump(nums1));

        int[] nums2 = new int[] {2, 3, 0, 1, 4};
        System.out.println(solution.jump(nums2));
    }
}
