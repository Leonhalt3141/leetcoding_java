
class Solution507 {
    public boolean checkPerfectNumber(int num) {

        if (num == 1) return false;

        int firstPrime = 1;
        if (num > 1) {
            firstPrime = 2;
            while (num % firstPrime != 0) {
                firstPrime++;
            }
        }

        int x = 1;
        int sum = 0;
        while (x <= num / firstPrime) {
            if (num % x == 0) sum += x;
            x++;
        }
        return sum == num;
    }
}

public class PerfectNumber {
    public static void main(String[] args) {
        Solution507 solution = new Solution507();

        System.out.println(solution.checkPerfectNumber(28));

        System.out.println(solution.checkPerfectNumber(7));

        System.out.println(solution.checkPerfectNumber(1));
    }
}
