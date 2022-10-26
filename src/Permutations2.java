import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int num : nums) counter.put(num, counter.getOrDefault(num, 0) + 1);

        List<Integer> comb = new ArrayList<>();

        process(answer, comb, nums, counter);
        return answer;
    }

    void process(List<List<Integer>> answer, List<Integer> comb, int[] nums, HashMap<Integer, Integer> counter) {
        if (comb.size() == nums.length) {
            answer.add(new ArrayList<>(comb));
            return;
        }

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            Integer num = entry.getKey();
            Integer count = entry.getValue();

            if (count == 0) continue;

            comb.add(num);
            counter.put(num, count - 1);

            process(answer, comb, nums, counter);

            comb.remove(comb.size() - 1);
            counter.put(num, count);
        }

    }

}

public class Permutations2 {
}
