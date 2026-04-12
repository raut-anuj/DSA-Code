class Solution {
    public int calculateMinimumHP(int[][] d) {
        int m = d.length;
        int n = d[0].length;
 
        int[][] t = new int[m][n];
 
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (i == m - 1 && j == n - 1) {
                    if (d[i][j] >= 0)
                        t[i][j] = 1;
                    else
                        t[i][j] = Math.abs(d[i][j]) + 1;
                }
                else {
                    int right = (j + 1 >= n) ? Integer.MAX_VALUE : t[i][j + 1];
                    int down  = (i + 1 >= m) ? Integer.MAX_VALUE : t[i + 1][j];

                    int minNext = Math.min(right, down);

                    int result = minNext - d[i][j];

                    t[i][j] = (result <= 0) ? 1 : result;
                }
            }
        }
        return t[0][0];
    }
}