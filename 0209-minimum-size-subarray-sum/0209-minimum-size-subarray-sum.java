class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size = nums.length;

        int sum = 0;
        int min = Integer.MAX_VALUE;

        int j=0;
        for(int i=0;i<size;i++){
            sum += nums[i];

            while(sum >= target){
                min = Math.min(min,i-j+1);

                sum -= nums[j];
                j++;
            }

        }

        return min == Integer.MAX_VALUE ? 0 : min ;
    }
}