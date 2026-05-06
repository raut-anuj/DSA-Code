class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] res = new int[2 * n - 1];
        boolean[] used = new boolean[n + 1];
        solve(res, used, 0, n);
        return res;
    }

    private boolean solve(int[] res, boolean[] used, int idx, int n) {
        if (idx == res.length) return true;

        if (res[idx] != 0) return solve(res, used, idx + 1, n);

        for (int num = n; num >= 1; num--) {
            if (used[num]) continue;

            if (num == 1) {
                res[idx] = 1;
                used[1] = true;

                if (solve(res, used, idx + 1, n)) return true;

                res[idx] = 0;
                used[1] = false;
            } else {
                int j = idx + num;
                if (j < res.length && res[idx] == 0 && res[j] == 0) {
                    res[idx] = res[j] = num;
                    used[num] = true;

                    if (solve(res, used, idx + 1, n)) return true;

                    res[idx] = res[j] = 0;
                    used[num] = false;
                }
            }
        }
        return false;
    }
}