import java.util.ArrayList;
import java.util.List;

class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answer = new ArrayList<>();

        while (left <= right) {
            if (selfDivide(String.valueOf(left))) answer.add(left);
            left++;
        }
        return answer;
    }

    boolean selfDivide(String num) {
        if (num.contains("0")) return false;
        char[] chArray = num.toCharArray();
        int value = Integer.parseInt(num);

        for (char c : chArray) {
            int v = c - '0';
            if (value % v != 0) return false;
        }
        return true;
    }

}

public class SelfDividingNumbers {
    public static void main(String[] args) {
        Solution728 solution = new Solution728();

        System.out.println(solution.selfDividingNumbers(1, 22));

        System.out.println(solution.selfDividingNumbers(47, 85));
    }
}
