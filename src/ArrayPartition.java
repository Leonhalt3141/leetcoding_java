import java.util.Arrays;

class Solution561 {
    public int arrayPairSum(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < size / 2; i++) {
            sum += Integer.min(nums[i*2], nums[i*2 + 1]);
        }
        return sum;

    }
}

public class ArrayPartition {
    public static void main(String[] args) {
        Solution561 solution = new Solution561();

        System.out.println(solution.arrayPairSum(new int[]{1, 4, 3, 2}));

        System.out.println(solution.arrayPairSum(new int[]{6,2,6,5,1,2}));
    }
}
