
class Solution200 {

    private int n;
    private int m;

    public int numIslands(char[][] grid) {
        int count = 0;

        n = grid.length;
        if (n == 0) return count;

        m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    DFSMarking(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void DFSMarking(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
        grid[i][j] = '0';
        DFSMarking(grid, i + 1, j);
        DFSMarking(grid, i - 1, j);
        DFSMarking(grid, i, j + 1);
        DFSMarking(grid, i, j - 1);
    }
}

public class NumberOfIslands {
    public static void main(String[] args) {
        Solution200 solution = new Solution200();

        char[][] grid1 = new char[][]{};
    }
}
