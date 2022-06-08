import java.util.HashMap;
import java.util.List;
import java.util.Stack;

class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) return 0;

        int R = obstacleGrid.length;
        int C = obstacleGrid[0].length;

        obstacleGrid[0][0] = 1;

        for (int i = 1; i < R; i++) {
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 1) ? 1 : 0;
        }

        for (int i = 1; i < C; i++) {
            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1 : 0;
        }

        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (obstacleGrid[i][j] == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                } else {
                    obstacleGrid[i][j] = 0;
                }
            }
        }

        return obstacleGrid[R - 1][C - 1];
    }


}

public class UniquePaths2 {
    public static void main(String[] args) {

        Solution63 solution = new Solution63();

        int[][] obstacleGrid1 = new int[][] {
                new int[]{0, 0, 0},
                new int[]{0, 1, 0},
                new int[]{0, 0, 0}
        };

        System.out.println(solution.uniquePathsWithObstacles(obstacleGrid1));
    }
}
