
class Solution69 {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x < 4) return 1;


        int left = 1;
        int right = x;

        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (x / mid == mid) {
                return mid;
            } else if (x / mid > mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left - 1;

//        int factor = 2;
//        while (true) {
//            int calculated = factor * factor;
//            if (calculated == x) return factor;
//            if (calculated > x) return factor - 1;
//            factor++;
//        }
    }
}

public class SqrtX {
    public static void main(String[] args) {
        Solution69 solution = new Solution69();

        int x1 = 4;
        System.out.println(solution.mySqrt(x1));

        int x2 = 8;
        System.out.println(solution.mySqrt(x2));

        int x3 = 2;
        System.out.println(solution.mySqrt(x3));

        int x4 = 2147395599;
        System.out.println(solution.mySqrt(x4));

        int x5 = 2147483647;
        System.out.println(solution.mySqrt(x5));

    }
}
