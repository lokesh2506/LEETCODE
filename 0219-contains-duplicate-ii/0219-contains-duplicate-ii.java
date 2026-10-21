class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int size = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        int j = 0;
        for(int i=0;i<size;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            if(Math.abs(j-i) > k){
                map.put(nums[j],map.get(nums[j])-1);
                if(map.get(nums[j]) == 0){
                    map.remove(nums[j]);
                }
                j++;
            }

            if(map.get(nums[i]) > 1){
                return true;
            }
        }

        return false;
    }
}