import java.util.Arrays;

class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        double average = Integer.MIN_VALUE;
        int size = nums.length;

        if (size == k) {
            average = 0;

            int left = 0;
            int right = size - 1;

            while (left < right) {
                average += nums[left] + nums[right];
                left++;
                right--;
            }
            if (size % 2 == 1) average += nums[left];

            return average / k;
        }

        double dummy = 0;
        for (int i = 0; i <= size - k; i++) {

            if (i == 0) {
                for (int j = 0; j < k; j++) dummy += nums[i + j];
            } else {
                dummy += nums[i + k - 1];
                dummy -= nums[i - 1];
            }

            average = Math.max(average, dummy / k);
        }
        return average;
    }
}

public class MaximumAverageSubarray1 {
    public static void main(String[] args) {
        Solution643 solution = new Solution643();

        System.out.println(solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));

        System.out.println(solution.findMaxAverage(new int[]{5}, 1));
    }
}
