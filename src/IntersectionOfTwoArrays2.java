import java.util.*;

class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int size1 = nums1.length;
        int size2 = nums2.length;

        int i = 0;
        int j = 0;
        int index = 0;

        while (i < size1 && j < size2) {
            if (nums1[i] == nums2[j]) {
                nums1[index++] = nums2[j];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(nums1, index);
    }
}

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        Solution350 solution = new Solution350();

        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(solution.intersect(nums1, nums2)));
    }
}
