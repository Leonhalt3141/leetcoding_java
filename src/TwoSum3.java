import java.util.Arrays;

public class TwoSum3 {
    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;

        if (size == 2) return new int[]{0, 1};

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                int sum = nums[i] + nums[j];

                if (sum == target) return new int[]{i, j};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
