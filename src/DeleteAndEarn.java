import java.util.HashMap;

class Solution740 {
    public int deleteAndEarn(int[] nums) {
        int size = nums.length;
        if (size == 1) return nums[0];

        HashMap<Integer, Integer> points = new HashMap<>();

        int maxNumber = 0;

        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNumber = Integer.max(num, maxNumber);
        }

        int[] maxPoints = new int[maxNumber + 1];
        maxPoints[1] = points.getOrDefault(1, 0);

        for (int num = 2; num < maxPoints.length; num++) {
            int gain = points.getOrDefault(num, 0);
            maxPoints[num] = Integer.max(maxPoints[num - 1], maxPoints[num - 2] + gain);
        }
        return maxPoints[maxNumber];
    }
}

public class DeleteAndEarn {
    public static void main(String[] args) {
        Solution740 solution = new Solution740();

        int[] nums1 = new int[]{3, 4, 2};
        System.out.println(solution.deleteAndEarn(nums1));

        int[] nums2 = new int[]{2, 2, 3, 3, 3, 4};
        System.out.println(solution.deleteAndEarn(nums2));
    }
}
