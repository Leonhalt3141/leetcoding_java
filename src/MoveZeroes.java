import java.util.Arrays;

class Solution283 {
    public void moveZeroes(int[] nums) {
        int size = nums.length;

        if (size <= 1) return;

        int[] result = new int[size];

        int j = 0;
        for (int num : nums) {
            if (num != 0) {
                result[j] = num;
                j++;
            }
        }
        System.arraycopy(result, 0, nums, 0, size);
    }
}

public class MoveZeroes {
    public static void main(String[] args) {
        Solution283 solution = new Solution283();

        int[] nums1 = new int[]{0,1,0,3,12};
        solution.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = new int[]{0};
        solution.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
    }

}
