
class Solution198 {
    public int rob(int[] nums) {
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

public class HouseARobber {
    public static void main(String[] args) {
        Solution198 solution = new Solution198();

        int[] nums1 = new int[]{1, 2, 3, 1};
        System.out.println(solution.rob(nums1));

        int[] nums2 = new int[]{2, 7, 9, 3, 1};
        System.out.println(solution.rob(nums2));
    }
}
