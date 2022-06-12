import java.util.ArrayList;
import java.util.List;

class Solution78 {
    List<List<Integer>> answer = new ArrayList<>();
    int n, k;

    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        if (curr.size() == k) {
            answer.add(new ArrayList<>(curr));
            return;
        }

        for (int i = first; i < n; i++){
            curr.add(nums[i]);
            backtrack(i + 1, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        for (k = 0; k < n + 1; ++k) {
            backtrack(0, new ArrayList<>(), nums);
        }

        return answer;
    }

    void printSubsets(List<List<Integer>> subsets) {
        for (List<Integer> subset : subsets) {
            System.out.print(subset.toString() + ", ");
        }
        System.out.println("");
    }

}

public class Subsets {
    public static void main(String[] args) {
        Solution78 solution = new Solution78();

        int[] nums1 = new int[]{1, 2, 3};

        solution.printSubsets(solution.subsets(nums1));

    }
}
