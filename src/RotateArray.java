import java.util.Arrays;

class Solution189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] dummy = new int[n];

        if (n > k){
            for (int i = 0; i < n; i++) {
                if (i < n - k) {
                    dummy[i + k] = nums[i];
                } else {
                    dummy[i - (n - k)] = nums[i];
                }
            }
        } else {
            int offset = k % n;
            for (int i = 0; i < n; i++) {
                if (i < n - offset) {
                    dummy[i + offset] = nums[i];
                } else {
                    dummy[i - (n - offset)] = nums[i];
                }
            }
        }

        System.arraycopy(dummy, 0, nums, 0, n);
    }
}

public class RotateArray {
    public static void main(String[] args) {
        Solution189 solution = new Solution189();

        int[] nums1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        solution.rotate(nums1, k1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = new int[]{-1};
        int k2 = 2;
        solution.rotate(nums2, k2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = new int[]{1, 2};
        int k3 = 3;
        solution.rotate(nums3, k3);
        System.out.println(Arrays.toString(nums3));
    }
}
