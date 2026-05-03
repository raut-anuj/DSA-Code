class Solution {
    public int[] countOppositeParity(int[] n) {

        int len = n.length;
        int[] ans = new int[len];

        if(len == 1) return new int[]{0};

        int ce = 0, co = 0;

        for(int i = len - 1; i >= 0; i--) {
            if(n[i] % 2 == 0) {
                ans[i] = co;  // even → count odd
                ce++;
            } else {
                ans[i] = ce;  // odd → count even
                co++;
            }
        }

        return ans;
    }
}