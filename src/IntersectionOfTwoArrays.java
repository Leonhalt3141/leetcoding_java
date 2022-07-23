import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int n : nums1) set1.add(n);

        HashSet<Integer> set2 = new HashSet<>();
        for (int n : nums2) set2.add(n);

        set1.retainAll(set2);

        int[] output = new int[set1.size()];

        int index = 0;
        for (int s : set1) output[index++] = s;
        return output;

    }
}

public class IntersectionOfTwoArrays {
}
