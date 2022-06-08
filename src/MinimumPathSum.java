
class Solution64 {

    private int[][] mem;

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        mem = new int[m][n];

        return gridSum(grid, m - 1, n - 1);

    }

    private int gridSum(int[][] grid, int m, int n) {
        if (m == 0 && n == 0) return grid[0][0];
        if (mem[m][n] != 0) return mem[m][n];

        if (m == 0) {
            mem[0][n] = grid[0][n] + gridSum(grid, 0, n - 1);
            return mem[0][n];
        }
        if (n == 0) {
            mem[m][0] = grid[m][0] + gridSum(grid, m - 1, 0);
            return mem[m][0];
        }

        mem[m][n] = grid[m][n] + Math.min(gridSum(grid, m - 1, n), gridSum(grid, m, n - 1));
        return mem[m][n];
    }
}

public class MinimumPathSum {
    public static void main(String[] args) {
        Solution64 solution = new Solution64();

        int[][] grid1 = new int[][]{
                new int[]{1, 3, 1},
                new int[]{1, 5, 1},
                new int[]{4, 2, 1}
        };

        System.out.println(solution.minPathSum(grid1));
    }
}
