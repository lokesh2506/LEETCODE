class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int prefixSum = 0;

        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            int reminder = prefixSum - goal;

            if(map.containsKey(reminder)){
                count += map.get(reminder);
            }

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }


        return count;
    }
}