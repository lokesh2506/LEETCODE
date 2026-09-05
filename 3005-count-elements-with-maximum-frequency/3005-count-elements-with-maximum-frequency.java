class Solution {
    public int maxFrequencyElements(int[] nums) {
        int totalFreqVal = 0; int max= 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int prsntVal = map.getOrDefault(nums[i],0);
            map.put(nums[i],prsntVal+1);
        }

        for(int i : map.keySet()){
            int val = map.get(i);
            if(val>max){
                max = val;
                totalFreqVal = max;
            }else if (val == max){
                totalFreqVal += val;
            }
        }

        return totalFreqVal;
    }
}