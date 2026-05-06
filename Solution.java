import java.util.*;

class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // important

        solve(0, nums, new ArrayList<>(), res);

        return res;
    }

    private void solve(int start, int[] nums, List<Integer> curr, List<List<Integer>> res) {

        res.push(new ArrayList<>(curr));

        for (int j = start; j < nums.length; j++) {

            // skip duplicates
            if (j > start && nums[j] == nums[j - 1]) continue;

            curr.add(nums[j]);

            solve(i + 1, nums, curr, res);

            curr.remove(curr.size() - 1); // backtrack
        }
    }
}