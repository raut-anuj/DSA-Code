class Solution {
    public int sumOfPrimesInRange(int n) {

        int k = n;
        int rev = 0;

        // reverse number
        while(n != 0){
            int j = n % 10;
            rev = rev * 10 + j;
            n = n / 10;
        }

        int mine = Math.min(k, rev);
        int maxe = Math.max(k, rev);

        int sum = 0;

        for(int i = mine; i <= maxe; i++){
            if(isPrime(i)){
                sum += i;
            }
        }

        return sum;
    }

    private boolean isPrime(int x){
        if(x <= 1) return false;

        for(int i = 2; i * i <= x; i++){
            if(x % i == 0) return false;
        }

        return true;
    }
}