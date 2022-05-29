
class Solution4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1 = nums1.length, size2 = nums2.length;

        int totalSize = size1 + size2;
        int halfSize = totalSize / 2;

        int[] A = (size1 >= size2) ? nums2 : nums1;
        int[] B = (size1 >= size2) ? nums1 : nums2;

        if (A.length == 0) return ((B[B.length/2] + B[(B.length-1)/2]) / (double)2);
        if (A.length == 1 && B.length == 1) return (A[0] + B[0]) / (double) 2;

        int left = 0;
        int right = A.length;

        while (left <= right) {
            int i = (left + right) / 2;  // A
            int j = halfSize - i;  // B

            int leftA = (i == 0) ? Integer.MIN_VALUE : A[i - 1];
            int rightA = (i == A.length) ? Integer.MAX_VALUE : A[i];
            int leftB = (j == 0) ? Integer.MIN_VALUE : B[j - 1];
            int rightB = (j == B.length) ? Integer.MAX_VALUE :  B[j];

            // partition is correct
            if (leftA > rightB) {
                right = i - 1;
            } else if (leftB > rightA) {
                left = i + 1;
            } else {
                if (totalSize % 2 == 1) {
                    return (double) Math.min(rightA, rightB);
                } else {
                    return (double) (( Math.max(leftA, leftB) + Math.min(rightA, rightB)) / (double) 2);
                }
            }
        }
        return 0.0;
    }

}

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();

        int[] nums1_1 = new int[]{1, 2};
        int[] nums2_1 = new int[]{2};

        System.out.println(solution.findMedianSortedArrays(nums1_1, nums2_1));

        int[] nums1_2 = new int[]{1};
        int[] nums2_2 = new int[]{2, 3};

        System.out.println(solution.findMedianSortedArrays(nums1_2, nums2_2));

    }
}
