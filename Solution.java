class Solution {
public:
    bool canPartitionKSubsets(vector<int>& n, int k) {
        //isme hm ek T, OT, 
    }
    solve(idx, k, OT, T, map){
        if(k==0)
            retrun true;
        if(t==0) return solve(0, k-1, ot, ot, map);

        for(int i=idx; i<n; i++){
            int nums = n[i];
            if(map.get(nums) == 0) continue;

            if(nums > target) continue;

            map.value(nums) --;
            solve(idx+1, k, ot, t-n[i], map);
            map.value9(nums) ++;
        }
    }
};