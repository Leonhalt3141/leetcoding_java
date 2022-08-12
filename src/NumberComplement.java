
class Solution476 {
    public int findComplement(int num) {
        int n = 0;
        for (int i = 0; i < 32; i++) {
            n |= num >> i;
        }

        return  num ^ n;

    }
}

public class NumberComplement {
    public static void main(String[] args) {
        Solution476 solution = new Solution476();

        System.out.println(solution.findComplement(5));

        System.out.println(solution.findComplement(1));
    }
}
