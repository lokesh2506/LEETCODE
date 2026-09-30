class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length;

        int max = nums[0];
        int currSum = nums[0];

        for(int i=1;i< size;i++){
            currSum = Math.max(nums[i],currSum+nums[i]);
            max = Math.max(max,currSum);

        }

        return max;

    }
}