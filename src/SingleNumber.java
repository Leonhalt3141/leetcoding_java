import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int single = 0;

        for (int key : map.keySet()) {
            int value = map.get(key);
            if (value == 1) {
                single = key;
            }
        }
        return single;
    }

    public int singleNumberA(int[] nums) {
        int single = 0;

        for (int num : nums) {
            single ^= num;
        }

        return single;

    }
}

public class SingleNumber {
    public static void main(String[] args) {
        Solution136 solution = new Solution136();

        int[] nums1 = new int[]{2, 2, 1};
        System.out.println(solution.singleNumber(nums1));

        int[] nums2 = new int[]{4,1,2,1,2};
        System.out.println(solution.singleNumberA(nums2));
        System.out.println("-------------------");
        int v = 0;
        v ^= 5;
        System.out.println(v);

        v ^= 2;
        System.out.println(v);

        v ^= 2;
        System.out.println(v);

        v ^=6;
        System.out.println(v);

        v ^=1;
        System.out.println(v);

        v ^=6;
        System.out.println(v);

        v ^=5;
        System.out.println(v);

    }
}
