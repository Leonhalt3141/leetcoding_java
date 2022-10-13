import java.util.Arrays;

class Solution724 {

    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;

        int size = nums.length;

        for (int i = 0; i < size; i++) {
            left = sum(nums, 0, i - 1);
            right = sum(nums, i + 1, size - 1);

            if (left == right) return i;
        }

        return -1;
    }

    int sum(int[] array, int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) total += array[i];
        return total;
    }

}

public class FindPivodIndex {
    public static void main(String[] args) {
        Solution724 solution = new Solution724();

        System.out.println(solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));

        System.out.println(solution.pivotIndex(new int[]{1, 2, 3}));

        System.out.println(solution.pivotIndex(new int[]{2, 1, -1}));
    }
}
