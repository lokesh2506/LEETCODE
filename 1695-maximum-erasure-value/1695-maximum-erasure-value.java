class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        int sum = 0;
        int max = Integer.MIN_VALUE;

        HashSet<Integer> set = new HashSet<>();

        int j=0;
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                sum -= nums[j];
                set.remove(nums[j]);
                j++;
            }

            set.add(nums[i]);
            sum += nums[i];

            max = Math.max(max,sum);
        }

        return max;




        // int sum = 0;
        // int max = Integer.MIN_VALUE;

        // HashMap<Integer,Integer> map = new HashMap<>();

        // int j=0;
        // for(int i=0;i<nums.length;i++){
        //     sum += nums[i];
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        //     while(map.get(nums[i]) >= 2){
        //         sum -= nums[j];

        //         map.put(nums[j],map.get(nums[j])-1);
        //         if(map.get(nums[j])==0){
        //             map.remove(nums[j]);
        //         }

        //         j++;
        //     }

        //     max = Math.max(max,sum);
        // }

        // return max;
    }
}