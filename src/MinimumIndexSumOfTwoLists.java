import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) map1.put(list1[i], i);

        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < list2.length; i++) {
            String key = list2[i];
            if (map1.containsKey(key)) {
                int calc = map1.get(key) + i;
                if (sum > calc) {
                    answer = new ArrayList<>();
                    answer.add(key);
                    sum = calc;
                } else if (sum == calc) {
                    answer.add(key);
                }
            }
        }

        return answer.toArray(new String[0]);
    }
}

public class MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        Solution599 solution = new Solution599();

        System.out.println(
                Arrays.toString(
                        solution.findRestaurant(
                        new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                        new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"}
                        ))
        );

        System.out.println(
                Arrays.toString(
                solution.findRestaurant(
                        new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                        new String[]{"KFC","Shogun","Burger King"}))
        );

        System.out.println(
                Arrays.toString(
                        solution.findRestaurant(
                        new String[]{"happy","sad","good"},
                        new String[]{"sad","happy","good"})
                )
        );
    }
}
