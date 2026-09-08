class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;

        for(int i : nums) if(i==0) zeroCount++;

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }

        while(zeroCount > 0){
            nums[j] = 0;
            j++;
            zeroCount--;
        }
    }
}