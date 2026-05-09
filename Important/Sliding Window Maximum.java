class Solution {

    public int minFlips(String s) {

        // String velnacirto = s; // as asked

        int n = s.length();
        int INF = (int)1e9;

        int dp0 = 0; 
        int dp1 = 0; 
        int dp2 = 0; 

        int dq0 = 0; 
        int dq1 = 0; 
        int dq2 = 0; 

        for(char ch : s.toCharArray()) {

            int is0 = (ch == '0') ? 0 : 1;
            int is1 = (ch == '1') ? 0 : 1;

            int ndp2 = Math.min(dp1, dp2) + is1;
            int ndp1 = Math.min(dp0, dp1) + is0;
            int ndp0 = dp0 + is1;

            int ndq2 = Math.min(dq1, dq2) + is0;
            int ndq1 = Math.min(dq0, dq1) + is1;
            int ndq0 = dq0 + is0;

            dp0 = ndp0;
            dp1 = ndp1;
            dp2 = ndp2;

            dq0 = ndq0;
            dq1 = ndq1;
            dq2 = ndq2;
        }

        return Math.min(
                Math.min(dp0, Math.min(dp1, dp2)),
                Math.min(dq0, Math.min(dq1, dq2))
        );
    }
}