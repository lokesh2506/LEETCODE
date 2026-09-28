class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int size = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        int count = 0;

        for(int i=0;i<size;i++){
            sum += nums[i];

            int reminder = sum % k ;

            // -1 2 9   k= 2

            // -1%2 = -1 --> -1+k = -1+2 = 1->1

            // 1+2 = 3 - 3%2 -> 1  -> count += map.get(reminder); == 1

            if(reminder < 0) reminder +=  k;

            if(map.containsKey(reminder)){
                count += map.get(reminder);
            }

            map.put(reminder,map.getOrDefault(reminder,0)+1);
        }

        return count;

    }
}