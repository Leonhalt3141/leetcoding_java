import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int size = nums.length;
        if (size == 0) return result;

        int value = nums[0];
        int[] range = new int[2];
        range[0] = value;
        if (size == 1) {
            result.add(Integer.toString(range[0]));
            return result;
        }

        for (int i = 1; i < size; i++) {
            if (Math.abs(nums[i] - value) > 1) {
                result.add(stringRange(range));

                range[0] = nums[i];
                range[1] = 0;
            } else {
                range[1] = nums[i];
            }
            value = nums[i];
        }
        result.add(stringRange(range));
        return result;
    }

    String stringRange(int[] range) {
        if (range[1] != 0) {
            return range[0] + "->" + range[1];
        } else {
            return Integer.toString(range[0]);
        }
    }
}

public class SummaryRanges {
    public static void main(String[] args) {
        Solution228 solution = new Solution228();

        int[] nums1 = new int[]{0,1,2,4,5,7};
        System.out.println(solution.summaryRanges(nums1).toString());

        int[] nums2 = new int[]{0,2,3,4,6,8,9};
        System.out.println(solution.summaryRanges(nums2).toString());

        int[] nums3 = new int[]{-2147483648,-2147483647,2147483647};
        System.out.println(solution.summaryRanges(nums3).toString());

    }
}
