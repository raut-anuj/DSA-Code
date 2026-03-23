class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int s=nums1[i]+nums2[i];
                if(pq.size()<k)
                    pq.offer(s,[nums1[i], nums2[i]]);
                else{
                    int k=pq.peek();
                    if(k>s)
                        pq.poll();
                    pq.offer(s,[nums1[i], nums2[i]])
                }
                }
            }
        }
    }
}