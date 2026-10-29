class Solution {
    public int countPrimes(int n) {
        if(n == 0 || n==1){
            return 0;
        }

        boolean prime[] = new boolean[n];

        int count = n-2; // o and 1 neglated
        
        for(int i=2;i<=Math.sqrt(n-1);i++){
            if(!prime[i]){
                for(int j = i*i;j<n;j+=i){
                    if(!prime[j]){
                        prime[j] = true;
                        count--;
                    }
                }
            }
        }


        return count;

    }
}