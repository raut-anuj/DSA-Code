class Solution {
    public int brokenCalc(int sv, int tv) {
        int c = 0;

        while (tv > sv) {

            if (tv % 2 == 0) {
                tv = tv / 2;
            } else {
                tv = tv + 1;
            }

            c++;
        }

        return c + (sv - tv);
    }
} sum =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        
            n--;
        }
        return ans;
    }
}   