import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int size = nums.length;
        List<List<Integer>> answers = new ArrayList<>();

        if (size < 4) return answers;

        Arrays.sort(nums);

        for (int a = 0; a < size - 3; a++) {
            if (a != 0) {
                while (a < size - 3 & nums[a] == nums[a - 1]) a++;
            }

            for (int b = a + 1; b < size - 2; b++) {
                if (b != a + 1) {
                    while (b < size - 2 & nums[b] == nums[b - 1]) b++;
                }

                int c = b + 1;
                int d = size - 1;

                while (c < d) {
                    long sum = (long) nums[a] + (long) nums[b] + (long) nums[c] + (long) nums[d];

                    if (sum == target) {
                        List<Integer> answer = new ArrayList<>(4);
                        answer.add(nums[a]);
                        answer.add(nums[b]);
                        answer.add(nums[c]);
                        answer.add(nums[d]);
                        answers.add(answer);
                        c++;
                        d--;

                        while (c < d & nums[c] == nums[c - 1]) c++;

                        while (c < d & nums[d] == nums[d + 1]) d--;
                    } else if (sum < target) {
                        c++;
                    } else d--;
                }
            }
        }

        return answers;

    }
}

public class FourSum {
    public static void main(String[] args) {
        Solution18 solution = new Solution18();

        System.out.println(solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));

        System.out.println(solution.fourSum(new int[]{2, 2, 2, 2, 2}, 8));

        System.out.println(solution.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));
    }
}
