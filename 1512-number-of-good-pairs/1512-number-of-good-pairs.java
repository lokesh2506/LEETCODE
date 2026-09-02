class Solution {
    public int numIdenticalPairs(int[] nums) {
        int size = nums.length;

        if (size < 2) return 0;

        int handShakenPair = 0;

        Map<Integer,Integer> numsMap = new HashMap<>();

        for(int i=0;i<size;i++){
            int alreadyPresent = numsMap.getOrDefault(nums[i],0);
            handShakenPair += alreadyPresent;
            numsMap.put(nums[i],alreadyPresent+1);
        }

        return handShakenPair;
    }
}