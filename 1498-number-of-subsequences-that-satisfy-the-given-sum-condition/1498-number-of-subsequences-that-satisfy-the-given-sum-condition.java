class Solution {
    public int numSubseq(int[] nums, int target) {
        final int MOD = 1000000007;

        Arrays.sort(nums);

        int size = nums.length;

        int power[] = new int[size]; // 1 2 4 8 16 ... 
        power[0] = 1;

        for(int i = 1;i<size;i++){
            power[i] = (power[i-1] * 2) % MOD;  // 1 * 2 -> 2 * 2 = 4 ->
        }


        int left = 0;
        int right = size - 1;
        int result = 0;

        while(left <= right){
            
            if((nums[left] + nums[right])<= target){
                result = (result + power[right - left]) % MOD;
                left++;
            }else{
                right--;
            }
        }

        return result;
    }
}