import java.util.ArrayList;
import java.util.List;

class Solution119 {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> answer = new ArrayList<>();
        int[] rowArray = new int[1];

        for (int row = 0; row < rowIndex + 1; row++) {
            answer = new ArrayList<>();

            rowArray[0] = 1;

            if (row > 0) {
                rowArray[rowArray.length - 1] = 1;
                answer.add(1);
                for (int i = 1; i < rowArray.length; i++) {
                    answer.add(rowArray[i - 1] + rowArray[i]);
                }

            }
            answer.add(1);

            if (row != rowIndex) {
                rowArray = new int[answer.size()];
                for (int i = 0; i < answer.size(); i++) rowArray[i] = answer.get(i);
            }

        }
        return answer;
    }

    void printAnswer(List<Integer> answer) {
        System.out.println(answer.toString());
    }

}

public class PascalsTriangle2 {
    public static void main(String[] args) {
        Solution119 solution = new Solution119();

        int rowIndex1 = 3;
        solution.printAnswer(solution.getRow(rowIndex1));

        int rowIndex2 = 4;
        solution.printAnswer(solution.getRow(rowIndex2));

        int rowIndex3 = 0;
        solution.printAnswer(solution.getRow(rowIndex3));

    }
}
