
class Solution292 {
    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }
}

public class NimGame {
    public static void main(String[] args) {
        Solution292 solution = new Solution292();

        int n1 = 4;
        System.out.println(solution.canWinNim(n1));

        int n2 = 1;
        System.out.println(solution.canWinNim(n2));

        int n3 = 2;
        System.out.println(solution.canWinNim(n3));

    }
}
