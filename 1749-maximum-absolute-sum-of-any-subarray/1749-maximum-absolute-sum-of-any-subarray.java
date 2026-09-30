class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int size = nums.length;

        int minSum = nums[0];
        int currMin = 0;

        int maxSum = nums[0];
        int currMax = 0;

        for(int i=0;i<size;i++){
            // max subarray
            currMin = Math.min(nums[i],nums[i]+currMin);
            minSum = Math.min(minSum,currMin);

            // min subarray
            currMax = Math.max(nums[i],nums[i]+currMax);
            maxSum = Math.max(maxSum,currMax);
        }

        return Math.max(Math.abs(minSum),Math.abs(maxSum));
    }
}