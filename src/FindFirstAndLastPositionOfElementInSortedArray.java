import java.util.Arrays;

class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int size = nums.length;

        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = (right - left) / 2 + left;
            int value = nums[mid];

            if (value == target) {
                left = mid;
                right = mid;

                while (left >= 0 && nums[left] == target) left--;
                while (right < size && nums[right] == target) right++;

                return new int[]{left + 1, right - 1};
            } else if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return new int[]{-1, -1};
    }
}

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Solution34 solution = new Solution34();

        System.out.println(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));

        System.out.println(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));

        System.out.println(Arrays.toString(solution.searchRange(new int[]{}, 0)));

        System.out.println(Arrays.toString(solution.searchRange(new int[]{1}, 1)));
    }
}
