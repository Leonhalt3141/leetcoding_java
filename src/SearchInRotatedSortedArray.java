
class Solution33 {
    public int search(int[] nums, int target) {
        int size = nums.length;

        int left = 0;
        int right = size - 1;

        while (left <= right) {
            if (nums[left] == target) return left;
            if (nums[right] == target) return right;

            left++;
            right--;

        }
        return -1;
    }
}

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Solution33 solution = new Solution33();

        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));

        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));

        System.out.println(solution.search(new int[]{1}, 0));
    }
}
