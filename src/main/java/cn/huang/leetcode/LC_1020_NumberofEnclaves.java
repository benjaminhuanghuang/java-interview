package cn.huang.leetcode;

/*
    1020. Number of Enclaves

    Given a 2D array A, each cell is 0 (representing sea) or 1 (representing land)

    A move consists of walking from one land square 4-directionally to another land square, or off the boundary of the grid.

    Return the number of land squares in the grid for which we cannot walk off the boundary of the grid in any number of moves.
    [試計算無法走到邊界的所有陸地面積個數，即全部被0包圍的1數量。]

    Example 1:

    Input: [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
    Output: 3
    Explanation:
    There are three 1s that are enclosed by 0s, and one 1 that isn't enclosed because its on the boundary.

    Example 2:

    Input: [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
    Output: 0
    Explanation:
    All 1s are either on the boundary or can reach the boundary.

 */
public class LC_1020_NumberofEnclaves {
    public int numEnclaves(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;


        // 4 borders
        int row = 0;
        for (int j = 0; j <= cols - 1; j++) {
            if (A[row][j] != 0) {
                walk(A, row, j);
            }
        }
        row = rows - 1;
        for (int j = 0; j <= cols - 1; j++) {
            if (A[row][j] != 0) {
                walk(A, row, j);
            }
        }
        int col = 0;
        for (int i = 0; i <= rows - 1; i++) {
            if (A[i][col] != 0) {
                walk(A, i, col);
            }
        }
        col = cols - 1;
        for (int i = 0; i <= rows - 1; i++) {
            if (A[i][col] != 0) {
                walk(A, i, col);
            }
        }

        int sum = 0;
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                sum += A[i][j];
            }
        }
        return sum;
    }

    private boolean judge(int rows, int cols, int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < cols;

    }

    void walk(int[][] A, int x, int y) {
        int rows = A.length;
        int cols = A[0].length;

        if (judge(rows, cols, x, y) && A[x][y] == 1) {
            A[x][y] = 0;
            walk(A, x - 1, y);
            walk(A, x + 1, y);
            walk(A, x, y - 1);
            walk(A, x, y + 1);
        }
    }
}
