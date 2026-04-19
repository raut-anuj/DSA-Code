//This is generally known as "Monotonic increasing/decreasing  Queue/Dequeue"
//Approach-1 (Using Deque) Every element is added(pushed) and popped only once,So it is O(n) time complexity.
//SEE MY COMMENT IN THE VIDEO where I have explained why we can't take QUEUE to solve this.
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> q = new ArrayDeque<>(); 
        int i=0, j=0, ptr=0; 
        int n = nums.length; 
        int[] res = new int[n-k+1]; 

        while(j<n){
            while(!q.isEmpty() && q.peekLast()<nums[j]){
                q.pollLast(); 
            }
        
            q.add(nums[j]);

            if(j-i+1<k){
                j++; 
            }else if(j-i+1==k){

                res[ptr++] = q.peek();
                
                if(nums[i]==q.peek()){
                    q.pollFirst(); 
                }
                i++; 
                j++;
            }
        }

        return res; 

    }
}