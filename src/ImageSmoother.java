
class Solution661 {
    public int[][] imageSmoother(int[][] img) {
        int row_size = img.length;
        int col_size = img[0].length;
        int[][] smoothed = new int[row_size][col_size];

        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j < col_size; j++) {

                int n = 1;
                int value = img[i][j];

                // top left
                int y = i - 1;
                int x = j - 1;
                if (y >= 0 && x >= 0) {
                    value += img[y][x];
                    n++;
                }

                // top center
                if (y >= 0) {
                    value += img[y][j];
                    n++;
                }

                // top right
                x = j + 1;
                if (y >= 0 && x < col_size) {
                    value += img[y][x];
                    n++;
                }

                // center left
                x = j - 1;
                if (x >= 0) {
                    value += img[i][x];
                    n++;
                }

                // center right
                x = j + 1;
                if (x < col_size) {
                    value += img[i][x];
                    n++;
                }

                // bottom left
                y = i + 1;
                x = j - 1;
                if (y < row_size && x >= 0) {
                    value += img[y][x];
                    n++;
                }

                // bottom center
                if (y < row_size) {
                    value += img[y][j];
                    n++;
                }

                // bottom right
                x = j + 1;
                if (y < row_size && x < col_size) {
                    value += img[y][x];
                    n++;
                }
                smoothed[i][j] = value / n;
            }
        }

        return smoothed;

    }
}

public class ImageSmoother {
}
