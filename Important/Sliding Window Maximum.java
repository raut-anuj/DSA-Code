import java.util.Arrays;

class Solution {
    public int maximumBags(int[] c, int[] r, int ar) {

        int n = c.length;
        int[] narr = new int[n];

        // remaining space
        for (int i = 0; i < n; i++) {
            narr[i] = c[i] - r[i];
        }

        Arrays.sort(narr);

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (narr[i] == 0) {
                count++;
            } 
            else if (narr[i] <= ar) {
                ar -= narr[i];
                count++;
            } 
            else {
                break;
            }
        }

        return count;
    }
}