
class Solution240 {

    int m;
    int n;

    boolean found;
    public boolean searchMatrix(int[][] matrix, int target) {
        m = matrix.length;
        n = matrix[0].length;

        found = false;
        findTarget(matrix, target, 0, 0);
        return found;
    }

    void findTarget(int[][] matrix, int target, int i, int j) {
        if (i == m - 1 && j == n - 1) found = false;
        if (target == matrix[i][j]) found = true;

        if (i < m - 1 && target >= matrix[i+1][j]) {
            findTarget(matrix, target, i + 1, j);
        }
        if (j < n - 1 && target >= matrix[i][j+1]) {
            findTarget(matrix, target, i, j + 1);
        }
    }

    public boolean searchMatrixA(int[][] matrix, int target) {
        m = matrix.length;
        n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (target < matrix[row][col]) {
                col--;
            } else if (target > matrix[row][col]) {
                row++;
            } else return true;
        }
        return false;
    }
}

public class Search2DMatrix2 {
    public static void main(String[] args) {
        Solution240 solution = new Solution240();

        int[][] matrix1 = new int[][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target1 = 5;

        System.out.println(solution.searchMatrixA(matrix1, target1));

    }
}
