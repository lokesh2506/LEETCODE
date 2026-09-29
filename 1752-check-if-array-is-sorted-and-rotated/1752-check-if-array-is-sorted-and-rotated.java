class Solution {
    public boolean check(int[] nums) {
        int size = nums.length;

        int missed = 0;

        for(int i=0;i<size;i++){
            if(nums[i] > nums[(i+1)%size]){
                missed++;
            }
        }

        return missed > 1 ? false :true;
    }
}