import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution347 {

    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        Map<Integer, List<Integer>> count2 = new TreeMap<>();

        for (int n : count.keySet()) {
            List<Integer> numbersList = count2.get(count.get(n));

            if (numbersList != null) {
                numbersList.add(n);
            } else {
                numbersList = new ArrayList<>();
                numbersList.add(n);
                count2.put(count.get(n), numbersList);
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int c: count2.keySet()) {
            List<Integer> numbersList = count2.get(c);
            list.addAll(numbersList);
        }

        int i = 0;
        for (int j = list.size() - 1; j > list.size() - 1- k; j--){
            result[i++] = list.get(j);
        }

        return result;
    }
}

public class TopKFrequentElements {
    public static void main(String[] args) {
        Solution347 solution = new Solution347();

        int[] nums1 = new int[]{1,1,1,2,2,3, 3, 3,3 ,3};
        int k1 = 2;
        System.out.println(Arrays.toString(solution.topKFrequent(nums1, k1)));
    }
}
