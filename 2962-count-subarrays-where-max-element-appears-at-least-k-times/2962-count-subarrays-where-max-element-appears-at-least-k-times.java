class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxEle = Integer.MIN_VALUE;

        for(int num : nums){
            maxEle = Math.max(maxEle,num);
        }
        long maxOccurence = 0;
        long ans = 0;

        int left = 0;
        for(int right = 0;right<nums.length;right++){
            if(maxEle == nums[right]){
                maxOccurence++;
            }

            while(maxOccurence >= k){
                if(maxEle == nums[left]){
                    maxOccurence--;
                }
                left++;
            }

            ans += left;
        }

        return ans;
    }
}