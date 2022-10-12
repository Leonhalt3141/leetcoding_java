
class Solution693 {
    public boolean hasAlternatingBits(int n) {
        String bits = Integer.toBinaryString(n);
        for (int i = 0; i < bits.length() - 1; i++) {
            if (bits.charAt(i) == bits.charAt(i + 1)) return false;
        }
        return true;
    }
}

public class BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        Solution693 solution = new Solution693();

        System.out.println(solution.hasAlternatingBits(5));

        System.out.println(solution.hasAlternatingBits(7));

        System.out.println(solution.hasAlternatingBits(11));
    }
}
