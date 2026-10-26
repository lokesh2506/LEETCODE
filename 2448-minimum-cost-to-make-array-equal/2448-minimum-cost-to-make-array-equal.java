class Solution {
    public long minCost(int[] nums, int[] cost) {
        long left = nums[0];
        long right = nums[0];


        for (int num : nums) {
            left = Math.min(left, num);
            right = Math.max(right, num);
        }

        while(left <right){
            long mid = left +(right-left)/2; 
            long cost1 = getCost(nums,cost,mid);
            long cost2 = getCost(nums,cost,mid+1);
            if(cost1<cost2){
                right = mid;
            }else{
                left = mid +1;
            }
        }

        return getCost(nums,cost,left);
    }

    public long getCost(int [] nums,int [] costs,long target){
        long costSpend = 0;

        for(int i=0;i<nums.length;i++){
            costSpend += Math.abs((long)nums[i] - target) * costs[i]; 
        }


        return costSpend;
    }
}