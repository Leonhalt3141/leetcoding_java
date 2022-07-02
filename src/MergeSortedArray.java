import java.util.Arrays;

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail = m + n - 1;

        int tail2 = n - 1;
        int tail1 = m -1;

        while(tail2 >= 0) {
            if (tail1 >= 0 && nums1[tail1] > nums2[tail2]) {
                nums1[tail] = nums1[tail1];
                tail--;
                tail1--;
            } else {
                nums1[tail] = nums2[tail2];
                tail--;
                tail2--;
            }
        }
    }
}

public class MergeSortedArray {
    public static void main(String[] args) {
        Solution88 solution = new Solution88();

        int[] nums1_1 = new int[]{1,2,3,0,0,0};
        int m1 = 3;
        int[] nums2_1 = new int[]{2,5,6};
        int n1 = 3;

        solution.merge(nums1_1, m1, nums2_1, n1);
        System.out.println(Arrays.toString(nums1_1));


        int[] nums1_2 = new int[]{0};
        int m2 = 0;
        int[] nums2_2 = new int[]{1};
        int n2 = 1;

        solution.merge(nums1_2, m2, nums2_2, n2);
        System.out.println(Arrays.toString(nums1_2));

        int[] nums1_3 = new int[]{0,0,0,0,0};
        int m3 = 0;
        int[] nums2_3 = new int[]{1, 2,3, 4, 5};
        int n3 = 5;

        solution.merge(nums1_3, m3, nums2_3, n3);
        System.out.println(Arrays.toString(nums1_3));

        int[] nums1_4 = new int[]{4,0,0,0,0,0};
        int m4 = 1;
        int[] nums2_4 = new int[]{1, 2,3, 5, 6};
        int n4 = 5;

        solution.merge(nums1_4, m4, nums2_4, n4);
        System.out.println(Arrays.toString(nums1_4));
    }
}
