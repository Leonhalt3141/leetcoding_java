/**
 * https://leetcode.com/problems/number-of-1-bits
 */

class Solution191 {

    public boolean getBit(int n, int i) {
        return (n & (i << i)) != 0;
    }
    public int hammingWeight(int n) {

        int count = 0;

        int bit = 1;

        for (int i = 0; i < 33; i++) {
            if ((n & bit) != 0) count++;

            bit <<= 1;
        }
        return count;

    }
}

public class NumberOf1Bit {
    public static void main(String[] args) {
        Solution191 solution = new Solution191();

        int n1 = 00000000000000000000000000001011;
        System.out.println(solution.hammingWeight(n1));

    }
}
