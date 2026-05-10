class Solution {

    int median(int[][] matrix) {

        int R = matrix.length;
        int C = matrix[0].length;

        int low = 1;
        int high = 2000;

        int need = (R * C) / 2;

        while (low < high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            for (int[] row : matrix) {
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