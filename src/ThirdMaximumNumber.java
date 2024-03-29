import java.util.Arrays;

class Solution414 {
    public int thirdMax(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);

        if (size < 3) return nums[size - 1];
        int count = 0;
        int max = Integer.MAX_VALUE;
        for (int i = size - 1; i >= 0; i--) {
            if (max > nums[i]) {
                max = nums[i];
                count++;
            }
            if (count == 3) return max;
        }

        return nums[size - 1];
    }
}

public class ThirdMaximumNumber {
}
