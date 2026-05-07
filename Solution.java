class Solution {
    public int brokenCalc(int sv, int tv) {
        int c = 0;

        while (tv > sv) {

            if (tv % 2 == 0) {
                tv = tv / 2;
            } else {
                tv = tv + 1;
            }

            c++;
        }

        return c + (sv - tv);
    }
}