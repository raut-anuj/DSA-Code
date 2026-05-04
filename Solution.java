class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int i, int[] arr, int target, List<Integer> curr, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if (i >= arr.length || target < 0) return;

        // take (same index allowed)
        curr.add(arr[i]);
        backtrack(i, arr, target - arr[i], curr, res);
        curr.remove(curr.size() - 1);

        // skip
        backtrack(i + 1, arr, target, curr, res);
    }
}