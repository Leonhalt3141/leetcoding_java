import java.util.*;

class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(nums);

        Set<Integer> unique = new HashSet<>();
        for (int num : nums) unique.add(num);

        int size = nums.length;

        for (int i = 1; i <= size; i++) {
            if (!unique.contains(i)) {
                answer.add(i);
            }
        }
        return answer;
    }
}

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        Solution448 solution = new Solution448();

        int[] nums1 = {4,3,2,7,8,2,3,1};
        System.out.println(solution.findDisappearedNumbers(nums1).toString());

        int[] nums2 = {1, 1};
        System.out.println(solution.findDisappearedNumbers(nums2).toString());

    }
}
