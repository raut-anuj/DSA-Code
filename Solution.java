class Solution {
    int max = 0;

    public int maxUniqueSplit(String s) {
        solve(0, s, new HashSet<>());
        return max;
    }

    private void solve(int idx, String s, HashSet<String> set) {
        if (idx == s.length()) {
            max = Math.max(max, set.size());
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            String sub = s.substring(idx, i + 1);

            if (!set.contains(sub)) {
                set.add(sub);
                solve(i + 1, s, set);
                set.remove(sub);
            }
        }
    }
}