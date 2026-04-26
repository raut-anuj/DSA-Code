class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min (solve(0), solve(1));
    }
    solve(int i){
        if(i==n-1) return 0;
       int take_1 = arr[i] + solve(i+1);
       int take_2 = arr[i] + solve(i+2);
       retrun Math.min(sum , Math.min(take_1 + take_2)) ; ;
    }
}