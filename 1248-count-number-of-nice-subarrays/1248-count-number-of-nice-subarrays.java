class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int prefixSum = 0;
        int ans = 0;

        for(int num : nums){
            prefixSum += num % 2;

            int reminder = prefixSum - k;
            if(map.containsKey(reminder)){
                ans += map.get(reminder);
            }

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }

        return ans;
    }
}