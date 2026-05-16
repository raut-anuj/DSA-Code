import java.util.*;

class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {

        List<int[]> x = new ArrayList<>();
        List<int[]> y = new ArrayList<>();

        for (int[] r : rectangles) {
            x.add(new int[]{r[0], r[2]});
            y.add(new int[]{r[1], r[3]});
        }

        return count(x) >= 3 || count(y) >= 3;
    }

    private int count(List<int[]> list) {

        Collections.sort(list, (a, b) -> Integer.compare(a[0], b[0]));

        int count = 0;
        int end = -1;

        for (int[] curr : list) {

            if (curr[0] > end) {
                count++;
                end = curr[1];
            } 
            else {
                end = Math.max(end, curr[1]);
            }
        }

        return count;
    }
}