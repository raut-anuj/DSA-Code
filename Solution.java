class Solution {
    public int minFallingPathSum(int[][] g) {

        int m1v=-1, m1c=-1, m2v=-1, m2c=-1;
        int n = g.length;

        for(int i=0; i<n; i++){
            if(m1c==-1 || m1v > g[n-1][i]){
                m2v=m1v; m2c=m1c;
                m1v=g[n-1][i]; m1c=i;
            }
            else if(m2v==-1 || g[n-1][i] < m2v){
                m2v=g[n-1][i];
                m2c=i;
            }
        }

        for(int i=n-2; i>=0; i--){

            int nm1v=-1,nm1c=-1,nm2v=-1,nm2c=-1;

            for(int j=0; j<n; j++){

                int ans;

                if(j!=m1c)
                    ans = g[i][j] + m1v;
                else
                    ans = g[i][j] + m2v;

                if(nm1c==-1 || ans < nm1v){
                    nm2v=nm1v; nm2c=nm1c;
                    nm1v=ans; nm1c=j;
                }
                else if(nm2c==-1 || ans < nm2v){
                    nm2v=ans; nm2c=j;
                }
            }

            m1v=nm1v; m1c=nm1c;
            m2v=nm2v; m2c=nm2c;
        }

        return m1v;
    }
}