class Solution {
    public boolean makesquare(int[] stick) {
        
    }
    solve(idx, sides, stick){
        if(idx == n){
            if(sides 0 == 1 ==2== 3) retrun true;
            return false;
        }
        for(int i=0;i<n;i++){
            if(i>0 && sides[i] == sides[i-1]) continue;

            if(sides[i]+ stick[idx]> target) continue;

            sides[i+= stick(idx)];
            if(solve())
                retrun true;
            sidesi[-]=stick9idx0;
        }
    }
}