import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution73 {
    private int m;
    private int n;

    public void setZeroes(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        List<int[]> locations = findZeroLocation(matrix);

        for (int[] location : locations) {
            setZero(matrix, location);
        }
        printMatrix(matrix);
    }

    List<int[]> findZeroLocation(int[][] matrix) {

        List<int[]> locations = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) locations.add(new int[]{i, j});
            }
        }
        return locations;
    }

    void setZero(int[][] matrix, int[] location) {

        int y = location[0];
        int x = location[1];

        for (int i = 0; i < n; i++) {
            matrix[y][i] = 0;
        }

        for (int j = 0; j < m; j++) {
            matrix[j][x] = 0;
        }

    }

    void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.print(Arrays.toString(ints) + " ");
        }
        System.out.println("");
    }

}

public class SetMatrixZeroes {
    public static void main(String[] args) {
        Solution73 solution = new Solution73();

        int[][] matrix1 = new int[][]{
                new int[]{1, 1, 1},
                new int[]{1, 0, 1},
                new int[]{1, 1, 1}
        };

        solution.setZeroes(matrix1);

        int[][] matrix2 = new int[][]{
                new int[]{0, 1, 2, 0},
                new int[]{3, 4, 5, 2},
                new int[]{1, 3, 1, 5}
        };

        solution.setZeroes(matrix2);
    }
}
