
class Solution704 {
    public int search(int[] nums, int target) {
        int size = nums.length;

        if (size == 1) return (nums[0] == target) ? 0 : -1;

        int left = 0;
        int right = nums.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Solution704 solution = new Solution704();

        int[] nums1 = new int[]{-1,0,3,5,9,12};
        int target1 = 9;
        System.out.println(solution.search(nums1, target1));

        int[] nums2 = new int[]{-1,0,3,5,9,12};
        int target2 = 2;
        System.out.println(solution.search(nums2, target2));
    }
}
