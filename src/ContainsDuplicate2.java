import java.util.HashMap;

class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (!map.containsKey(value)) map.put(value, i);
            else {
                if (Math.abs(map.get(value) - i) <= k) return true;
                map.put(value, i);
            }
        }
        return false;
    }
}

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        Solution219 solution = new Solution219();

        int[] nums1 = new int[]{1,2,3,1};
        int k1 = 3;
        System.out.println(solution.containsNearbyDuplicate(nums1, k1));

        int[] nums2 = new int[]{1,0,1,1};
        int k2 = 1;
        System.out.println(solution.containsNearbyDuplicate(nums2, k2));

        int[] nums3 = new int[]{1,2,3,1,2,3};
        int k3 = 2;
        System.out.println(solution.containsNearbyDuplicate(nums3, k3));

    }
}
