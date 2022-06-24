import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */

class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        int size = nums.length;
        mergeSort(nums, size);
        return nums[size - k];
    }


    private static void mergeSort(int[] a, int n) {
        if (n < 2) return;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    private static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) a[k++] = l[i++];
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num: nums){

            heap.offer(num);
            if(heap.size() > k){
                heap.poll();
            }
            System.out.println(heap);
        }
        //noinspection ConstantConditions
        return heap.peek();
    }

}

public class KthLargestElement {
    public static void main(String[] args) {
        Solution215 solution = new Solution215();

        int[] nums1 = new int[]{3, 2, 1, 5, 6, 4};
        System.out.println(solution.findKthLargest(nums1, 2));
        System.out.println(solution.findKthLargest2(nums1, 2));

        int[] nums2 = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println(solution.findKthLargest(nums2, 4));
        System.out.println(solution.findKthLargest2(nums2, 4));


    }
}
