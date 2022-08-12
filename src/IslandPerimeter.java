
class Solution463 {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        int rowSize = grid.length;
        int colSize = grid[0].length;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (grid[i][j] == 1) {
//                    int connected = countConnection(grid, i, j);
//                    count += 4 - connected;
                    count += 4;
                    if (i > 0 && grid[i - 1][j] == 1) count -= 2;
                    if (j > 0 && grid[i][j - 1] == 1) count -= 2;

                }
            }
        }
        return count;
    }

    int countConnection(int[][] grid, int i, int j) {
        int connection = 0;
        try {
            connection += grid[i][j - 1];
        } catch (Exception e) {

        }
        try {
            connection += grid[i - 1][j];
        } catch (Exception e) {

        }
        try {
            connection += grid[i][j + 1];
        } catch (Exception e) {

        }
        try {
            connection += grid[i + 1][j];
        } catch (Exception e) {

        }
        return connection;
    }

}

public class IslandPerimeter {
    public static void main(String[] args) {
        int[] grid = {0, 1, 1, 0};
        System.out.println(grid[-1]);
    }
}
