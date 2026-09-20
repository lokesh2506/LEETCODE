class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        long size = nums.length;
        long sum = 0;
        long max = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size()==k){
            max = Math.max(sum,max);
        }

        for(int i=k;i<size;i++){
            sum += nums[i]-nums[i-k];
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);

            map.put(nums[i-k], map.get(nums[i-k])-1);

            if(map.get(nums[i-k]) == 0) map.remove(nums[i-k]);

            if(map.size()==k) max = Math.max(max,sum);
        }


        return max;
    }
}