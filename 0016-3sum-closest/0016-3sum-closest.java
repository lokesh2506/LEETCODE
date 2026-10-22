class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int size = nums.length;

        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        int closest = 0;

        for(int i=0;i<size-2;i++){
            int left = i+1;
            int right = size - 1;

            while(left < right){
                int total = nums[i]+nums[left]+nums[right];
                if( total < target){
                    left++;
                }else{
                    right--;
                }

                if(Math.abs(target - total) < min){
                    min = Math.abs(target - total);
                    closest = total;
                }

            }
        }

        return closest;
    }
}