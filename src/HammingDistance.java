
class Solution461 {
    public int hammingDistance(int x, int y) {
        int distance = x ^ y;
        int i = 0;
        while (distance > 0) {
            distance &= distance - 1;
            i++;
        }

        return i;
    }
}

public class HammingDistance {
    public static void main(String[] args) {
        Solution461 solution = new Solution461();

        System.out.println(solution.hammingDistance(1, 4));

        System.out.println(solution.hammingDistance(3, 1));

        System.out.println(solution.hammingDistance(93, 73));
    }
}
