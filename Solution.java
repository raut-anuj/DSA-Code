class Solution {

    int m, n;

    public boolean exist(char[][] g, String s) {

        m = g.length;
        n = g[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(g[i][j] == s.charAt(0) && solve(s, g, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean solve(String s, char[][] g, int i, int j, int k){

        if(k == s.length())
            return true;

        if(i < 0 || j < 0 || i >= m || j >= n || g[i][j] != s.charAt(k))
            return false;

        char temp = g[i][j];
        g[i][j] = '0';   // mark visited

        boolean found =
                solve(s, g, i-1, j, k+1) ||
                solve(s, g, i+1, j, k+1) ||
                solve(s, g, i, j-1, k+1) ||
                solve(s, g, i, j+1, k+1);
 
        g[i][j] = temp;  // backtrack

        return found;
    }
}