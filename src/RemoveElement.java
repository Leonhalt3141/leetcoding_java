import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] ags) {
        int[] nums1 = {3,2,2,3};
        System.out.println(removeElement(nums1, 3));
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums2, 2));
        System.out.println(Arrays.toString(nums2));
    }
}
