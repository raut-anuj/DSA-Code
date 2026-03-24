import java.util.*;
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<pair>pq=new P.Q.<>(new pair(a,b) -> Double Compare(b.val, a.val))
        for(int i=0;i<n;i++){
            for(j=n-1;j>i;j--){
                if(!pq.size==k){
                      pq.offer();
                }
                else if(arr[i/j]<pq.peek().value){
                    pq.pop();
                    pq.offer();
                }
                else{
                    break;
                }
            }
        }
    }
}