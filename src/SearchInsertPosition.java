
class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;

        if (target > nums[size - 1]) return size;

        int left = 0;
        int right = size - 1;
        int mid;

        while (left < right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        mid = left + (right - left) / 2;
        return (nums[mid] > target) ? mid : mid + 1;
    }
}

public class SearchInsertPosition {
    public static void main(String[] args) {
        Solution35 solution = new Solution35();

        int[] nums1 = new int[]{1, 3, 5, 6};
        int target1 = 5;
        System.out.println(solution.searchInsert(nums1, target1));

        int[] nums2 = new int[]{1, 3, 5, 6};
        int target2 = 2;
        System.out.println(solution.searchInsert(nums2, target2));

        int[] nums3 = new int[]{1, 3, 5, 6};
        int target3 = 7;
        System.out.println(solution.searchInsert(nums3, target3));

        int[] nums4 = new int[]{1, 3};
        int target4 = 2;
        System.out.println(solution.searchInsert(nums4, target4));

        int[] nums5 = new int[]{1, 3, 5, 6};
        int target5 = 2;
        System.out.println(solution.searchInsert(nums5, target5));
        System.out.println();

        int[] nums6 = new int[]{-1, 3, 5, 6};
        int target6 = 0;
        System.out.println(solution.searchInsert(nums6, target6));
    }
}
