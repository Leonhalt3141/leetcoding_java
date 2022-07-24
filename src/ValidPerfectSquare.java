
class Solution368 {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        if (num < 4) return false;

        int end = num / 2;
        int start = 0;
        int mid;

        while (start <= end) {
            mid = (end - start) / 2 + start;

            double calculated = Math.pow(mid, 2);
            if (calculated == num) return true;

            if (calculated < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return false;
    }
}

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Solution368 solution = new Solution368();

        int num1 = 16;
        System.out.println(solution.isPerfectSquare(num1));

        int num2 = 14;
        System.out.println(solution.isPerfectSquare(num2));

        int num3 = 4;
        System.out.println(solution.isPerfectSquare(num3));

        int num4 = 2000105819;
        System.out.println(solution.isPerfectSquare(num4));

        int num5 = 100;
        System.out.println(solution.isPerfectSquare(num5));

        int num6 = 2147483647;
        System.out.println(solution.isPerfectSquare(num6));
    }
}
