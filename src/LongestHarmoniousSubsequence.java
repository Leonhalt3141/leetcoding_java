import java.util.Arrays;
import java.util.HashMap;

class Solution594 {
    public int findLHS(int[] nums) {

        int size = nums.length;
        int count = 0;

        if (size < 2) return count;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                count = Integer.max(count, map.get(key) + map.get(key + 1));
            }

        }
        return count;
    }
}

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        Solution594 solution = new Solution594();

        System.out.println(solution.findLHS(new int[] {1,3,2,2,5,2,3,7}));

        System.out.println(solution.findLHS(new int[] {1, 2, 3, 4}));

        System.out.println(solution.findLHS(new int[] {1, 1, 1, 1}));

        System.out.println(solution.findLHS(new int[] {-3, -1, -1, -1, -3, -2}));
    }
}
