class Solution {
    public int numOfSubarrays(int[] arr) {
        long odd = 0;
        long even = 1;

        long sum = 0;
        long count =0;

        long MOD = 1000000007;

        for(int num : arr){
            sum += num;

            if(sum % 2 == 0){
                count += odd;
                even++;
            }else{
                count += even;
                odd++;
            }

            count %= MOD;
        }

        return (int)count;
    }
}