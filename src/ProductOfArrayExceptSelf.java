
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        List<Integer> zeroIndex = new ArrayList<>();
        int product = 1;

        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) zeroIndex.add(i);
            else product *= nums[i];
        }

        if (zeroIndex.size() > 1) {
            for (int i = 0; i < size; i++) {
                result[i] = 0;
            }
        } else if (zeroIndex.size() == 1) {
            int zero_index = zeroIndex.get(0);

            for (int i = 0; i < size; i++) {
                if (i == zero_index) result[i] = product;
                else result[i] = 0;
            }
        } else {
            for (int i = 0; i < size; i++) {
                result[i] = product / nums[i];
            }
        }
        return result;
    }

    public int[] productExceptSelfA(int[] nums) {

        int size = nums.length;
        int[] result =  new int[size];
        int left = 1;

        for (int i = 0; i < size; i++) {
            result[i] = left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--){
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
}

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Solution238 solution = new Solution238();

        int[] nums1 = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(solution.productExceptSelfA(nums1)));

        int[] nums2 = new int[]{-1,1,0,-3,3};
        System.out.println(Arrays.toString(solution.productExceptSelfA(nums2)));

        int[] nums3 = new int[]{0,4,0};
        System.out.println(Arrays.toString(solution.productExceptSelfA(nums3)));
    }
}
