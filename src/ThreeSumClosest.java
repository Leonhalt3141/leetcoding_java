import java.util.Arrays;

class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        int size = nums.length;
        if (size == 3) return nums[0] + nums[1] + nums[2];

        Arrays.sort(nums);

        int answer = Integer.MAX_VALUE;


        for (int i = 0; i < size - 2; i++) {

            if (i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1;
                int right = size - 1;

                while (left < right) {
                    int sum = nums[left] + nums[right] + nums[i];
                    if (sum < target) {
                        while(left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                    } else if (sum > target) {
                        while (left < right && nums[right]  == nums[right - 1]) {
                            right--;
                        }
                        right--;
                    } else {
                        return sum;
                    }
                    if (Math.abs(target - sum) < Math.abs(target - answer)) answer = sum;
                }
            }
        }

        return answer;
    }

}

public class ThreeSumClosest {
    public static void main(String[] args) {
        Solution16 solution = new Solution16();

        int[] nums1 = {-1, 2, 1, -4};
        System.out.println(solution.threeSumClosest(nums1, 1));

        int[] nums2 = {0, 0, 0};
        System.out.println(solution.threeSumClosest(nums2, 1));

        int[] nums3 = {1, 1, 1, 0};
        System.out.println(solution.threeSumClosest(nums3, -100));

        int[] nums4 = {4,0,5,-5,3,3,0,-4,-5};
        System.out.println(solution.threeSumClosest(nums4, -2));
    }
}
