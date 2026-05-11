class Solution {

    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for (char ch : tasks) {
            freq[ch - 'A']++;
        }

        Arrays.sort(freq);

        int maxFreq = freq[25] - 1;

        int idle = maxFreq * n;

        for (int i = 24; i >= 0; i--) {
            idle -= Math.min(freq[i], maxFreq);
        }

        return idle > 0 ? idle + tasks.length : tasks.length;
    }
}