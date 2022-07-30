import java.util.Arrays;

class Solution852 {
    public int peakIndexInMountainArray(int[] arr) {
        int size = arr.length;
        int left = 0;
        int right = size - 1;
        int mid;

        while (left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;

            } else {
                right = mid;
            }

        }
        return left;
    }

    int binarySearch(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = left + (right - left) / 2;

        return Integer.max(binarySearch(arr, mid + 1, right), binarySearch(arr, left, right - 1));
    }

}

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        Solution852 solution = new Solution852();

        int[] arr1 = new int[]{0, 1, 0};
        System.out.println(solution.peakIndexInMountainArray(arr1));

        int[] arr2 = new int[]{0, 2, 1, 0};
        System.out.println(solution.peakIndexInMountainArray(arr2));

        int[] arr3 = new int[]{0, 10, 5, 2};
        System.out.println(solution.peakIndexInMountainArray(arr3));

        int[] arr4 = new int[]{24,69,100,99,79,78,67,36,26,19};
        System.out.println(solution.peakIndexInMountainArray(arr4));
    }
}
