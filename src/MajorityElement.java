import java.util.Arrays;

class Solution169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length / 2;
        return nums[mid];
    }
}

public class MajorityElement {
    public static void main(String[] args) {
        Solution169 solution = new Solution169();

        int[] nums1 = new int[]{3,2,3};
        System.out.println(solution.majorityElement(nums1));

        int[] nums2 = new int[]{2,2,1,1,1,2,2};
        System.out.println(solution.majorityElement(nums2));

    }
}
