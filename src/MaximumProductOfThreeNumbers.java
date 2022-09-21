import java.util.Arrays;

class Solution628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int size = nums.length;

        int product = (nums[1] < 0) ? nums[0] * nums[1] * nums[size - 1] : 0;

        int product_ = nums[size - 3] * nums[size - 2] * nums[size - 1];
        return Integer.max(product, product_);
    }
}

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        Solution628 solution = new Solution628();

        System.out.println(solution.maximumProduct(new int[]{1, 2, 3}));

        System.out.println(solution.maximumProduct(new int[]{1, 2, 3, 4}));

        System.out.println(solution.maximumProduct(new int[]{-1, -2, -3}));
    }
}
