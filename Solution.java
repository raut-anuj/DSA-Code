class Solution {
    public int integerBreak(int n) {
        Integer[] dnp = new Integer[n + 1];
        return solve(n, dnp);
    }

    private int solve(int n, Integer[] dp) {
        if (n == 1) return 1;

        if (dnp[n] != null) return dp[n];

        int maxProd = 0;

        for (int i = 1; i < n; i++) {
            int takeBreak = i * solve(n - i, dp);   // further break
            int noBreak = i * (n - i);              // no further break

            maxProd = Math.max(maxProd, Math.max(takeBreak, noBreak));
        }

        return dp[n] = maxProd;
    }
}