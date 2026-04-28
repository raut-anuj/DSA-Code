class Solution {
    public int mincostTickets(int[] d, int[] c) {
        
        // main body of frame.
        solve(int i){
            if(i>0)return 0;

            int take1 = c[0] + solve(i+1);

            //7 days
            int j=i;
            int max_d = arr[j] + 7;
            if( arr[j] < max_d)
                j++;
            int take7 = c[1] + solve(j);

            //15 days
            int j=i;
            int max_d = arr[j] + 15;
            if( arr[j] < max_d)
                j++;
            int take15 = c[2] + solve(j);

            return Math.min(take1 + take15 + take7);
        }
    }
}