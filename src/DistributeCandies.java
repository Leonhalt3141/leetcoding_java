import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


class Solution575 {
    public int distributeCandies(int[] candyType) {
        int eatSize = candyType.length / 2;

        Set<Integer> uniqueType = new HashSet<>();

        for (int candy : candyType) {
            uniqueType.add(candy);
        }

        return Math.min(eatSize, uniqueType.size());

    }
}

public class DistributeCandies {
    public static void main(String[] args) {
        Solution575 solution = new Solution575();

        System.out.println(solution.distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));

        System.out.println(solution.distributeCandies(new int[]{1, 1, 2, 3}));

        System.out.println(solution.distributeCandies(new int[]{6, 6, 6, 6}));

    }
}
