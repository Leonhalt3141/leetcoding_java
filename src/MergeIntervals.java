
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> answerList = new ArrayList<>();

        if (intervals.length > 1) {
            List<int[]> sorted = new ArrayList<>();
            sortIntervals(intervals, sorted);
            mergeIntervals(answerList, 0, sorted);
        }
        else answerList.add(intervals[0]);

        int[][] answer = new int[answerList.size()][2];
        for(int i = 0; i < answerList.size(); i++) answer[i] = answerList.get(i);

        return answer;
    }

    void sortIntervals(int[][] intervals, List<int[]> sorted) {
        sorted.add(intervals[0]);
        for (int[] interval : Arrays.asList(intervals).subList(1, intervals.length)) {
            int i = 0;
            boolean inserted = false;
            while (i < sorted.size()) {
                if (sorted.get(i)[0] >= interval[0]) {
                    sorted.add(i, interval);
                    i = sorted.size();
                    inserted = true;
                }
                i++;
            }
            if (!inserted) sorted.add(interval);
        }
    }

    void mergeIntervals(List<int[]> answer, int index, List<int[]> intervals) {

        if (index > intervals.size() - 1) {
            return ;
        }

        int[] interval = intervals.get(index);
        int[] compare;

        int i = 0;

        while (i < intervals.size()) {
            compare = intervals.get(i);
            if (checkOverlap(interval, compare)) {
                int start = Math.min(interval[0], compare[0]);
                int end = Math.max(interval[1], compare[1]);
                interval[0] = start;
                interval[1] = end;
                index = i;
            }
            i++;
        }
        answer.add(interval);

        mergeIntervals(answer, index + 1, intervals);

    }

    boolean checkOverlap(int[] interval1, int[] interval2) {
        int[] smaller;
        int[] larger;

        if (interval1[0] <= interval2[0]) {
            smaller = interval1;
            larger = interval2;
        } else {
            smaller = interval2;
            larger = interval1;
        }

        return smaller[1] >= larger[0];
    }

    void printAnswer(int[][] intervals) {
        for (int[] interval : intervals) {
            System.out.print(Arrays.toString(interval) + ", ");
        }
        System.out.println();
    }

}

public class MergeIntervals {
    public static void main(String[] args) {
        Solution56 solution = new Solution56();

        int[][] intervals1 = new int[][] {
                new int[]{1, 3},
                new int[]{2, 6},
                new int[]{8, 10},
                new int[]{15, 18}
        };

        solution.printAnswer(solution.merge(intervals1));

        int[][] intervals2 = new int[][] {
                new int[]{1, 4},
                new int[]{4, 5}
        };

        solution.printAnswer(solution.merge(intervals2));

        int[][] intervals3 = new int[][] {
                new int[]{1, 4},
                new int[]{0, 4}
        };

        solution.printAnswer(solution.merge(intervals3));

        int[][] intervals4 = new int[][] {
                new int[]{1, 4},
                new int[]{0, 2},
                new int[]{3, 5}
        };

        solution.printAnswer(solution.merge(intervals4));

        int[][] intervals5 = new int[][] {
                new int[]{2, 3},
                new int[]{5, 5},
                new int[]{2, 2},
                new int[]{3, 4},
                new int[]{3, 4}
        };

        solution.printAnswer(solution.merge(intervals5));

        int[][] intervals6 = new int[][] {
                new int[]{1, 4},
                new int[]{0, 4}
        };

        solution.printAnswer(solution.merge(intervals6));

    }
}
