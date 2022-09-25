import java.util.Arrays;
import java.util.HashMap;

class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int size = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int value : nums) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        int notContained = 0;
        int duplicated = 0;
        for (int i = 1; i <= size; i++) {
            if (!map.containsKey(i)) notContained = i;
            else if (map.get(i) == 2) duplicated = i;
        }

        return new int[]{duplicated, notContained};
    }
}

public class SetMismatch {
    public static void main(String[] args) {
        Solution645 solution = new Solution645();

        System.out.println(Arrays.toString(solution.findErrorNums(new int[]{1, 2, 2, 4})));

        System.out.println(Arrays.toString(solution.findErrorNums(new int[]{1, 1})));
    }
}
