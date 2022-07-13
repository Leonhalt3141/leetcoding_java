import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        int value = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (value == nums[i]) return true;
            value = nums[i];
        }
        return false;
    }

    public boolean containsDuplicateA(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int val : nums) {
            if(!set.add(val))
                return true;
        }
        return false;
    }
}

public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution217 solution = new Solution217();

        int[] nums1 = new int[]{1,2,3,1};
        System.out.println(solution.containsDuplicate(nums1));

        int[] nums2 = new int[]{1,2,3,4};
        System.out.println(solution.containsDuplicate(nums2));

        int[] nums3 = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(solution.containsDuplicate(nums3));

    }
}
