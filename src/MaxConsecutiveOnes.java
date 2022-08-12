
class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max_count = 0;

        for (int num : nums) {
            if (num == 1) count++;
            else {
                max_count = Integer.max(max_count, count);
                count = 0;
            }
        }
        max_count = Integer.max(max_count, count);

        return max_count;
    }

}

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Solution485 solution = new Solution485();

        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println(solution.findMaxConsecutiveOnes(nums1));

        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println(solution.findMaxConsecutiveOnes(nums2));
    }
}
