import java.util.Arrays;

class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int size = numbers.length;
        int left = 0;
        int right = size - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] == target) break;
            else if (numbers[left] + numbers[right] > target) right--;
            else left ++;
        }
        return new int[]{left + 1, right + 1};
    }

}
public class TwoSum2 {
    public static void main(String[] args) {
        Solution167 solution = new Solution167();

        int[] numbers1 = new int[]{2, 7, 11, 15};
        int target1 = 9;
        System.out.println(Arrays.toString(solution.twoSum(numbers1, target1)));

        int[] numbers2 = new int[]{2, 3, 4};
        int target2 = 6;
        System.out.println(Arrays.toString(solution.twoSum(numbers2, target2)));

        int[] numbers3 = new int[]{-1, 0};
        int target3 = -1;
        System.out.println(Arrays.toString(solution.twoSum(numbers3, target3)));

    }
}
