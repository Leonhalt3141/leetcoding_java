import java.util.*;

/**
 * https://leetcode.com/problems/3sum/
 */

class Solution15 {

    List<List<Integer>> addAnswer(List<List<Integer>> answers, List<Integer> answer) {
        if (answers.size() == 0) {
            answers.add(answer);
        } else {
            for (List<Integer> element : answers) {
                List<Integer> check = new ArrayList<>();
                check.add(element.get(0));
                check.add(element.get(1));
                check.add(element.get(2));

                for (int i = 0; i < 3; i++) {
                    int value = answer.get(i);
                    if (check.contains(value)) {
                        check.remove((Integer) value);
                    }
                }

                if (check.size() == 0) return answers;
            }
            answers.add(answer);
        }
        return answers;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        int size = nums.length;
        List<List<Integer>> answers = new ArrayList<>();
        if (size < 3) return answers;

        for (int i=0; i<size-2; i++) {
            for (int j=i+1; j<size-1; j++){
                int rest = nums[i] + nums[j];

                for (int k=j+1; k<size; k++) {

                    if (rest + nums[k] == 0) {
                        List<Integer> answer = new ArrayList<>();
                        answer.add(nums[i]);
                        answer.add(nums[j]);
                        answer.add(nums[k]);

                        answers = addAnswer(answers, answer);
                    }
                }
            }
        }

        return answers;
    }
}

public class ThreeSum {
    public static void main(String[] args) {
        Solution15 solution = new Solution15();

        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(solution.threeSum(nums));

    }

}
