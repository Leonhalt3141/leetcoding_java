import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        if (n <= 1) {
            matrix[0][0] = 1;
        }

        List<Integer> edgeList = new ArrayList<>();
        edgeList.add(n);

        for (int e = n - 1; e > 0; e--) {
            edgeList.add(e);
            edgeList.add(e);
        }

        List<String> directionList = new ArrayList<>();
        directionList.add("right");

        for (int d = 1; d < edgeList.size(); d++) {
            String prev = directionList.get(d - 1);
            switch (prev) {
                case "right":
                    directionList.add("down");
                    break;
                case "down":
                    directionList.add("left");
                    break;
                case "left":
                    directionList.add("up");
                    break;
                case "up":
                    directionList.add("right");
                    break;
            }
        }

        int i = -1;
        int j = 0;

        int value = 1;

        for (int index = 0; index < edgeList.size(); index++) {
            int edge = edgeList.get(index);
            String direction = directionList.get(index);

            for (int s = 0; s < edge; s++) {


                switch (direction) {
                    case "right":
                        i += 1;
                        break;
                    case "down":
                        j += 1;
                        break;
                    case "left":
                        i -= 1;
                        break;
                    case "up":
                        j -= 1;
                        break;
                }
                matrix[j][i] = value;
                value ++;
            }

        }
        return matrix;
    }

    void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.print(Arrays.toString(ints));
        }
        System.out.println("");
    }
}

public class SpiralMatrix2 {
    public static void main(String[] args) {
        Solution59 solution = new Solution59();

        int n1 = 3;
        solution.printMatrix(solution.generateMatrix(n1));

        int n2 = 4;
        solution.printMatrix(solution.generateMatrix(n2));
    }
}
