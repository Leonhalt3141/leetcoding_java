
class NumArray {

    int[] numArray;

    public NumArray(int[] nums) {
        numArray = nums;

    }

    public int sumRange(int left, int right) {
        int value = 0;
        while (left <= right) {
            value += numArray[left];
            left++;
        }
        return value;
    }
}

public class RangeSumQueryImutable {
}
