class Solution {

    public int matrixMedian(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int low = 1;
        int high = 1000000;

        int need = (m * n) / 2;

        while (low < high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            // count elements <= mid
            for (int[] row : grid) {
                count += upperBound(row, mid);
            }

            if (count <= need) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    // returns count of elements <= target
    private int upperBound(int[] arr, int target) {

        int l = 0;
        int r = arr.length;

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}