class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>();

        for(int i:nums){
            int val = map.getOrDefault(i,0);
            map.put(i,val+1);
        }

        int total = 0,max = 0;
        for(int i:map.keySet()){
            if(map.get(i) == max ){
                total += map.get(i);
            }else if(map.get(i) > max){
                total = map.get(i);
                max = Math.max(max,total);
            }
            
        }

        return total;
    }
}