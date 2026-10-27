class Solution {
    public long minCost(int[] nums, int[] cost) {
        long answer = Long.MAX_VALUE;

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for (int n: nums) {
            left = Math.min(left, n);
            right = Math.max(right, n);
        }

        while (left <= right) {
            int mid = left + (right-left)/2;

            long cost1 = getCost(nums, cost, mid);
            long cost2 = getCost(nums, cost, mid+1);

            if (cost1 <= cost2) {
                right = mid - 1;
                answer = Math.min(answer, Math.min(cost1, cost2));
            } else {
                left = mid + 1;
            }
        }
        return answer;

    }

    public long getCost(int [] nums,int [] costs,long target){
        long costSpend = 0;

        for(int i=0;i<nums.length;i++){
            costSpend += Math.abs((long)nums[i] - target) * costs[i]; 
        }


        return costSpend;
    }
}