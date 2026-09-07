class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,LinkedList<Integer>> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            LinkedList<Integer> list = map.getOrDefault(nums[i],new LinkedList<>());

            list.add(i);
            map.put(nums[i],list);

        }

       
        for(int i=0;i<nums.length;i++){
            int balance = target - nums[i];
            LinkedList<Integer> list = map.getOrDefault(balance,new LinkedList<>());

            if((nums[i] == balance) && (list.size() >= 2)) return new int[]{list.get(0),list.get(1)};
            if((nums[i] != balance) && (list.size() != 0)) return new int[]{i,list.get(0)};

        }

        return new int[]{};
    }
}