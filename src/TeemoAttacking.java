
class Solution495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (duration == 0) return 0;

        int size = timeSeries.length;
        if (size == 1) return duration;

        int count = 0;
        int prev = timeSeries[0];

        for (int i = 1; i < size; i++) {
            int time = timeSeries[i];

            count += Math.min(time - prev, duration);
            prev = time;
        }
        count += duration;
        return count;
    }
}

public class TeemoAttacking {
    public static void main(String[] args) {
        Solution495 solution = new Solution495();

        int[] timeSeries1 = {1, 4};
        int duration1 = 2;
        System.out.println(solution.findPoisonedDuration(timeSeries1, duration1));

        int[] timeSeries2 = {1, 2};
        int duration2 = 2;
        System.out.println(solution.findPoisonedDuration(timeSeries2, duration2));

        int[] timeSeries3 = {1, 2, 3, 4, 5};
        int duration3 = 5;
        System.out.println(solution.findPoisonedDuration(timeSeries3, duration3));

    }
}
