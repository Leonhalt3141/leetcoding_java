import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution697 {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        List<Integer> max_nums = new ArrayList<>();

        int max = 0;
        for (int key : map.keySet()) {
            int count = map.get(key);
            if (count == max) {
                max_nums.add(key);
            } else if (count > max) {
                max = count;
                max_nums.clear();
                max_nums.add(key);
            }
        }

        int min_count = nums.length;

        for (int num : max_nums) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                while (nums[left] != num) left++;
                while (nums[right] != num) right--;
                min_count = Integer.min(min_count, right - (left - 1));
                left = 1;
                right = 0;
            }

        }
        return min_count;
    }
}

public class DegreeOfAnArray {
    public static void main(String[] args) {
        Solution697 solution = new Solution697();

        System.out.println(solution.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));

        System.out.println(solution.findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));

        System.out.println(solution.findShortestSubArray(new int[]{1}));
    }
}
