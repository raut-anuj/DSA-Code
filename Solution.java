class Solution {

    List<String> res = new ArrayList<>();

    public List<String> readBinaryWatch(int turnedOn) {

        solve(0, 0, 0, turnedOn);

        return res;
    }

    private void solve(int idx, int hrs, int mins, int left) {

        if (hrs > 11 || mins > 59) return;

        if (left == 0) {
            res.add(hrs + ":" + (mins < 10 ? "0" + mins : mins));
            return;
        }

        for (int i = idx; i < 10; i++) {

            if (i < 4) {
                solve(i + 1, hrs + (1 << i), mins, left - 1);
            } else {
                solve(i + 1, hrs, mins + (1 << (i - 4)), left - 1);
            }
        }
    }
}