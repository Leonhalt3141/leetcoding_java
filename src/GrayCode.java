
import java.util.ArrayList;
import java.util.List;

class Solution89 {
    public List<Integer> grayCode(int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i != 1 << n; i++) {
            answer.add((i) ^ (i >> 1));
        }

        return answer;
    }

    void printCode(List<Integer> code) {
        System.out.println(code.toString());
    }

}

public class GrayCode {
    public static void main(String[] args) {
        Solution89 solution = new Solution89();

        int n1 = 2;
        solution.printCode(solution.grayCode(n1));
    }
}
