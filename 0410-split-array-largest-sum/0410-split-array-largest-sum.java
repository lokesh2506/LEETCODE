class Solution {
    public int splitArray(int[] nums, int k) {
        long left = 0;
        long right = 0;

        for(int num: nums){
            left = Math.max(left,num);
            right += num;
        }

        long ans = left;

        while(left<=right){
            long mid = left+(right-left)/2;

            if(canSplit(nums,k,mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return (int)ans;
    }

    public boolean canSplit(int[] nums, int k,long split){
        long currSum = 0;
        long parts = 1;

        for(int i=0;i<nums.length;i++){
            if(currSum + nums[i] > split){
                parts++;
                currSum = nums[i];
                if(parts > k){
                    return false;
                }
            }else{
                currSum += nums[i];
            }
        }

        return true;
    }
}