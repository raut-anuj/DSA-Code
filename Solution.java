class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] o) {
        int n = o.length;
        int[] res = new int[n];

        List<Integer> lis = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int idx = upperBound(lis, o[i]);

            if (idx == lis.size()) {
                lis.add(o[i]);
            } else {
                lis.set(idx, o[i]);
            }

            res[i] = idx + 1;
        }

        return res;
    }

    // first index jahan value > target ho
    private int upperBound(List<Integer> list, int target) {
        int l = 0, r = list.size();

        while (l < r) {
            int mid = (l + r) / 2;

            if (list.get(mid) <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}