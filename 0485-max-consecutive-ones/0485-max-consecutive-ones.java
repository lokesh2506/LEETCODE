class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int continueNum = 0;
        int max =0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                max= Math.max(max,continueNum);
                continueNum =0;
            }else{
                continueNum ++;
                max= Math.max(max,continueNum);
            }
        }
        return max;
    }
}