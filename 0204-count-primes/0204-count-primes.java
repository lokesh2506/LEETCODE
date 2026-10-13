class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;

        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        int primeCount = n-2; // bcoz 1 is not a prime 2 to n-1 we need to remove n-2

        for(int i=2;i<= Math.sqrt(n-1);i++){
            if(isPrime[i]){
                for(int j = i*i; j<n;j+=i){
                    if(isPrime[j]){
                        isPrime[j] = false;
                        primeCount--;
                    }
                }
            }
        }

        return primeCount;

    }
}