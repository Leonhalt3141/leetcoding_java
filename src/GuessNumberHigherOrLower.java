
class Solution374 {

    int pick;

    int guess(int num) {
        return Integer.compare(pick, num);
    }

    public int guessNumber(int n) {
        if (n == 1) return 1;

        int left = 1;
        int right = n;
        int mid;

        int check;

        while (left <= right) {
            mid = left + (right - left) / 2;
            check = guess(mid);

            if (check == 0) return mid;
            else if (check == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return left;
    }
}

public class GuessNumberHigherOrLower {
}
