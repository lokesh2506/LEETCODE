class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;

        for(int num : nums){
            totalSum += num;
        }

        int reminder = (int)(totalSum % p);
        if(reminder == 0) return 0;


        HashMap<Integer,Integer> reminderMap = new HashMap<>();
        reminderMap.put(0,-1);

        int minRmv = nums.length;
        long prefixSum = 0;

        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];

            int currentMod =(int)(prefixSum % p);
            int targetMod = (currentMod - reminder + p) % p;

            if(reminderMap.containsKey(targetMod)){
                int length = i- reminderMap.get(targetMod);
                minRmv = Math.min(minRmv,length);
            }

            reminderMap.put(currentMod,i);
        }

        return minRmv == nums.length ? -1 : minRmv;
    }
}