class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int size = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int sum = 0;

        for(int i=0;i<size;i++){
            sum += nums[i];

            int reminder = sum % k;

            if(map.containsKey(reminder)){
                if(i-map.get(reminder) >= 2){
                    return true;
                }
            }
            else{
                map.put(reminder,i);
            }
        }

        return false;
    }
}