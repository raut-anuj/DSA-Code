import java.util.*;

class Solution {

    public boolean canPartitionKSubsets(int[] nums, int k) {

        int sum = 0;
        for (int num : nums) sum += num;

        // total sum divisible hona chahiye
        if (sum % k != 0) return false;

        int target = sum / k;

        boolean[] used = new boolean[nums.length];

        return solve(nums, k, 0, 0, target, used);
    }

    private boolean solve(int[] nums, int k, int start, int currSum, int target, boolean[] used) {

        // sab buckets ban gaye
        if (k == 0) return true;

        // ek bucket complete ho gaya
        if (currSum == target) {
            return solve(nums, k - 1, 0, 0, target, used);
        }

        for (int i = start; i < nums.length; i++) {

            if (used[i]) continue;

            if (currSum + nums[i] > target) continue;

            used[i] = true;

            if (solve(nums, k, i + 1, currSum + nums[i], target, used)) {
                return true;
            }

            used[i] = false; // backtrack
        }

        return false;
    }
}