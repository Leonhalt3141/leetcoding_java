import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;

        int[] answer = new int[size1];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < size2; j++) map.put(nums2[j], j);

        for (int i = 0; i < size1; i++) {
            int num1 = nums1[i];
            int j = map.get(num1);
            boolean found = false;

            while (j < size2 && !found) {
                int num2 = nums2[j];
                if (num2 > num1) {
                    answer[i] = num2;
                    found = true;
                }
                j++;
            }
            if (!found) answer[i] = -1;
        }

        return answer;
    }
}

public class NextGreaterElement1 {
    public static void main(String[] args) {
        Solution496 solution = new Solution496();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        System.out.println(Arrays.toString(solution.nextGreaterElement(nums1, nums2)));

        System.out.println(Arrays.toString(solution.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4})));
    }
}
