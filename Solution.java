class Solution {
    public int uniquePathsWithObstacles(int[][] g) {
        int m = g.length;
        int n = g[0].length;
        int[][] t = new int[m][n];

        // Fix 1: Correct start cell initialization
        t[0][0] = (g[0][0] == 1) ? 0 : 1;

        // Fix 2: First row (simplified + corrected)
        for (int col = 1; col < n; col++) {
            if (g[0][col] == 1)
                t[0][col] = 0;
            else
                t[0][col] = t[0][col - 1];
        }
        // Fix 3: First column (corrected indices)
        for (int row = 1; row < m; row++) {
            if (g[row][0] == 1)
                t[row][0] = 0; 
            else
                t[row][0] = t[row - 1][0];
        }
 
        // Fix 4: Declare i properly
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (g[i][j] == 1)
                    t[i][j] = 0;
                else
                    t[i][j] = t[i - 1][j] + t[i][j - 1];
            }
        }

        return t[m - 1][n - 1];
    }
}