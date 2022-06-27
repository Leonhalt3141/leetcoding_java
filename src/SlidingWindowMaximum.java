import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;

class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int size = nums.length;
        int answer_size = size - (k - 1);

        int max = Integer.MIN_VALUE;
        int[] answer = new int[answer_size];

        for (int start = 0; start < answer_size; start++) {
            for (int i = 0; i < k; i++) {
                int value = nums[start + i];
                if (max < value) {
                    max = value;
                }
            }
            answer[start] = max;
            max = Integer.MIN_VALUE;
        }
        return answer;
    }

    public int[] maxSlidingWindowA(int[] nums, int k) {
        int size = nums.length;
        int answer_size = size - (k - 1);
        int[] answer = new int[answer_size];

        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

        int index = 0;
        for (int i = 0; i < size; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1)
                deque.poll();

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                deque.pollLast();

            deque.offer(i);

            if (i >= k - 1)
                answer[index++] = nums[deque.peek()];
        }

        return answer;
    }
}

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Solution239 solution = new Solution239();

        int[] nums1 = new int[]{1,3,-1,-3,5,3,6,7};
        int k1 = 3;
        System.out.println(Arrays.toString(solution.maxSlidingWindow(nums1, k1)));

        int[] nums2 = new int[]{1};
        int k2 = 1;
        System.out.println(Arrays.toString(solution.maxSlidingWindow(nums2, k2)));

    }
}
