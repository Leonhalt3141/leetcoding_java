
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

    public boolean isPerfectSquareA(int num) {
        if (num == 1) return true;
        if (num < 4) return false;

        int left = 0;
        int right = num / 2;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;

            double value = Math.pow(mid, 2);

            if (value == num) return true;
            else if (value > num) right = mid - 1;
            else left = mid + 1;
        }

        return false;

    }
}

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Solution368 solution = new Solution368();

        int num1 = 16;
        System.out.println(solution.isPerfectSquareA(num1));

        int num2 = 14;
        System.out.println(solution.isPerfectSquareA(num2));

        int num3 = 4;
        System.out.println(solution.isPerfectSquareA(num3));

        int num4 = 2000105819;
        System.out.println(solution.isPerfectSquareA(num4));

        int num5 = 100;
        System.out.println(solution.isPerfectSquareA(num5));

        int num6 = 2147483647;
        System.out.println(solution.isPerfectSquareA(num6));
    }
}
