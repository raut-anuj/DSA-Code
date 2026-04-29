class Solution {
    public int longestSubsequence(int[] arr, int diff) {
        Map<Integer, Integer> dp = new HashMap<>();
        int max = 1;

        for (int x : arr) {
            int prev = dp.getOrDefault(x - diff, 0);
            int curr = prev + 1;
            dp.put(x, curr);
            max = Math.max(max, curr);
        }

        return max;
    }
}