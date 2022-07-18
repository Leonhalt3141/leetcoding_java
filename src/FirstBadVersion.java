
class Solution278 {

    boolean isBadVersion(int version) {
        return true;
    }

    int version;

    public int firstBadVersion(int n) {
        if (n == 1) return 1;
        int start = 1;
        int end = n;
        int mid = (end + start) / 2;
        version = 0;

        while (start <= end) {
            if (isBadVersion(mid)) {

                if (isBadVersion((mid < 2) ? 1 : mid - 1 )) {
                    version = (mid < 2) ? 1 : mid - 1 ;
                    break;
                }
                end = mid - 1;
            } else {
                if (isBadVersion((mid == n) ? n : mid + 1)) {
                    version = (mid == n) ? n : mid + 1;
                    break;
                }
                start = mid + 1;
            }
            mid = (end + start) / 2;
        }

        return version;
    }

    public int firstBadVersionA(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

public class FirstBadVersion {
}
