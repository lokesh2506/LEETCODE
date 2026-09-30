class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int size = nums.length;

        int total = 0;

        int currMin = 0;
        int minSum = nums[0];

        int currMax = 0;
        int maxSum = nums[0];

        for(int i=0;i<size;i++){
            total += nums[i];

            // kadane's for min 
            currMin = Math.min(nums[i],currMin+nums[i]);
            minSum = Math.min(minSum,currMin);

            // kadane's for max;
            currMax = Math.max(nums[i],currMax+nums[i]);
            maxSum = Math.max(maxSum,currMax);
        }

        if(maxSum < 0) return maxSum;


        return Math.max(maxSum,total-minSum);

    }
}