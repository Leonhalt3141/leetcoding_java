import java.util.Arrays;

class Solution75 {
    public void sortColors(int[] nums) {
        mergeSort(nums, nums.length);
    }

    static void mergeSort(int[] a, int n) {
        if (n < 2) return;

        int mid = n / 2;

        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(a, 0, l, 0, mid);

        if (n - mid >= 0) System.arraycopy(a, mid, r, 0, n - mid);

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) a[k++] = l[i++];
            else a[k++] = r[j++];
        }

        while (i < left) a[k++] = l[i++];

        while (j < right) a[k++] = r[j++];

    }

    void sort1(int[] nums) {
        int[] mem = new int[3];

        for (int n : nums) mem[n]++;

        int c = 0;
        int k = 0;
        int N = nums.length;

        while (k < N) {
            int cnt = mem[c];
            if (cnt > 0) {
                nums[k++] = c;
                mem[c]--;
            } else c++;
        }
    }

    void sort2(int[] nums) {
        int n = nums.length;
        int a = 0, b = 0, c = 0;

        for (int num : nums) {
            if (num == 0) a++;
            else if (num == 1) b++ ;
            else c++;
        }

        for (int i = 0; i< n; i++) {
            if (a > 0) {
                nums[i] = 0;
                a--;
            } else if (b > 0) {
                nums[i] = 1;
                b--;
            } else if (c > 0) {
                nums[i] = 2;
                c--;
            }
        }
    }

}

public class SortColors {
    public static void main(String[] args) {
        Solution75 solution = new Solution75();

        int[] nums1 = new int[]{2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        System.out.println(Arrays.toString(nums1));

    }
}
