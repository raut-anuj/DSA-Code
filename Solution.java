class Solution {
    public int maxFixedPoints(int[] nums) {
        
    }
    solve(int i, int j) //starting dono 0 sh ho rha he.
    {
        
        if(nums[i] == j)
            return 1+solve(i+1, j+1);

        delete = solve(i+1, j);
        n_delete = solve(i+1, j+1);
        return Math.max(delete, n_delete);
    }
}