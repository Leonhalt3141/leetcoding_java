import java.util.Arrays;

class Solution566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int rows = mat.length;
        int cols = mat[0].length;
        int n = rows * cols;

        if (n > r * c) return mat;
        if (n < r * c) {
            r = rows;
            c = n / r;
        }
        int[][] reshaped = new int[r][c];

        for (int i = 0; i < n; i++) {
            int j = i / cols;
            int k = i - (j * cols);

            int new_j = i / c;
            int new_k = i - (new_j * c);

            reshaped[new_j][new_k] = mat[j][k];
        }

        return reshaped;
    }
}

public class ReshapeTheMatrix {

}
