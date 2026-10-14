class Solution {
    public long mathPower(long base,long power,long MOD){
        long result = 1;
        while(power>0){
            if(power % 2 == 1){
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            power /= 2;

        }

        return result;
    }
    public int countGoodNumbers(long n) {
        long MOD = 1000000007;

        long odd = n/2;
        long even = (n+1)/2;

        long oddPow = mathPower(4,odd,MOD);
        long evenPow = mathPower(5,even,MOD);

        return (int)((oddPow * evenPow) % MOD);
    }
}