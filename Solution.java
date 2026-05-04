class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(0, candidates, target, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int start, int[] arr, int target, List<Integer> curr, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            // skip duplicates
            if (i > start && arr[i] == arr[i - 1]) continue;

            if (arr[i] > target) break;

            curr.add(arr[i]);
            backtrack(i + 1, arr, target - arr[i], curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}