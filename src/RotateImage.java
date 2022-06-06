import java.util.Arrays;

class Solution48 {
    public void rotate(int[][] matrix) {

        int n = matrix[0].length;
        int m = matrix.length;

        int j_ = 0;
        for (int j = m - 1; j >= m / 2; j--) {
            int[] temp = matrix[j_];
            matrix[j_] = matrix[j];
            matrix[j] = temp;
            j_++;
        }

        boolean[][] checkMatrix = new boolean[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!checkMatrix[j][i]) {
                    int tempV = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = tempV;

                    checkMatrix[i][j] = true;
                    checkMatrix[j][i] = true;
                }
            }
        }
    }

    void printMatrix(int[][] matrix) {
        int m = matrix.length;
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}

public class RotateImage {
    public static void main(String[] args) {
        Solution48 solution = new Solution48();

        int[][] matrix1 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        solution.rotate(matrix1);
        solution.printMatrix(matrix1);

        int[][] matrix2 = new int[][] {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12 ,16}};
        solution.rotate(matrix2);
        solution.printMatrix(matrix2);

    }
}
