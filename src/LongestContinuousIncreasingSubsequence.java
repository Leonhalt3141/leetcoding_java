
class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        int size = nums.length;
        int length = 1;
        int longest = 0;

        for (int i = 1; i < size; i++) {
            if (nums[i - 1] < nums[i]) {
                length++;
            } else {
                longest = Integer.max(length, longest);
                length = 1;
            }
        }

        return Integer.max(length, longest);
    }
}

public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        Solution674 solution = new Solution674();

        System.out.println(solution.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));

        System.out.println(solution.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));

        System.out.println(solution.findLengthOfLCIS(new int[]{1, 3, 5, 4, 2, 3, 4, 5}));
    }
}
