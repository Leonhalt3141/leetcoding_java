
class Solution733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {
        int color = image[sr][sc];

        if (color != newcolor) fill(image, sr, sc, color, newcolor);
        return image;
    }

    void fill(int[][] image, int sr, int sc, int color, int newcolor) {

        if (image[sr][sc] == 0) return;

        if (image[sr][sc] == color) {
            image[sr][sc] = newcolor;

            if (sr > 0) {
                fill(image, sr - 1, sc, color, newcolor);
            }

            if (sc > 0) {
                fill(image, sr, sc - 1, color, newcolor);
            }

            if (sr < image.length - 1) {
                fill(image, sr + 1, sc, color, newcolor);
            }

            if (sc < image[0].length - 1) {
                fill(image, sr, sc + 1, color, newcolor);
            }
        }

    }

}

public class FloodFill {
    public static void main(String[] args) {
        Solution733 solution = new Solution733();

    }

}
