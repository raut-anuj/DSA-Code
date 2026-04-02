import java.util.*;

class Solution {
    public int[][] merge(int[][] arr) {

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        for (int[] curr : arr) {

            if (res.isEmpty() || res.get(res.size()-1)[1] < curr[0]) {
                res.add(curr);
            } 
            else {
                res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1], curr[1]);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}