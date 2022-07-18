import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution268 {
    public int missingNumber(int[] nums) {

        int size = nums.length;

        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) map.put(num, true);

        int value = 0;
        for (int i = 0; i < size + 1; i++) {
            if (!map.containsKey(i)) {
                value = i;
                break;
            }
        }
        return value;
    }

    public int missingNumberA(int[] nums) {
        int size = nums.length;
        int missing = 0;
        int i = 0;

        while (i < nums.length) {
            missing ^= i ^ nums[i];
            i++;
        }
        return missing ^ i;
    }
}

public class MissingNumber {

    public static void main(String[] args) {
        Solution268 solution = new Solution268();

        int[] nums1 = new int[]{ 3, 0, 1};
        System.out.println(solution.missingNumber(nums1));

        int[] nums2 = new int[]{ 0, 1};
        System.out.println(solution.missingNumber(nums2));

        int[] nums3 = new int[]{ 9,6,4,2,3,5,7,0,1};
        System.out.println(solution.missingNumberA(nums3));
    }

}
