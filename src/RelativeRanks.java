import java.util.Arrays;
import java.util.PriorityQueue;

class Solution506 {
    public String[] findRelativeRanks(int[] score) {
        int size = score.length;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        String[] answer = new String[size];

        for (int v : score) queue.add(v);

        String newV;
        int value;
        int queueSize = size;
        while (!queue.isEmpty()) {
            value = queue.poll();

            if (queueSize > 3) {
                newV = String.valueOf(queueSize);
            }
            else if (queueSize == 3) {
                newV = "Bronze Medal";
            }
            else if (queueSize == 2) {
                newV = "Silver Medal";
            }
            else newV = "Gold Medal";

            for (int i = 0; i < size; i++) {
                if (score[i] == value) {
                    answer[i] = newV;
                    break;
                }
            }
            queueSize = queue.size();
        }
        return answer;
    }
}

public class RelativeRanks {
    public static void main(String[] args) {
        Solution506 solution = new Solution506();

        System.out.println(Arrays.toString(solution.findRelativeRanks(new int[]{5, 4, 3, 2, 1})));

        System.out.println(Arrays.toString(solution.findRelativeRanks(new int[]{10, 3, 8, 9, 4})));
    }
}
