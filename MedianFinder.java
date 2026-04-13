class Solution {

    public int change(int t, int[] c) {
        int t[]
        return solve(0, 0, t, c);
    }

    public int solve(int s, int i, int t, int[] arr) {
        if (s == t) return 1;
        if (s > t || i >= arr.length) return 0;

        int take = solve(s + arr[i], i, t, arr);
        int skip = solve(s, i + 1, t, arr);

        return take + skip;
    }
}