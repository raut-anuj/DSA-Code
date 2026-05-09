class Solution {
    public int[] scoreValidator(String[] e) {

        int score = 0;
        int counter = 0;

        for (int i = 0; i < e.length; i++) {

            // stop if counter becomes 10
            if (counter == 10) break;

            if (e[i].equals("W")) {
                counter++;
            }
            else if (e[i].equals("WD") || e[i].equals("NB")) {
                score += 1;
            }
            else {
                score += Integer.parseInt(e[i]);
            }
        }

        return new int[]{score, counter};
    }
}