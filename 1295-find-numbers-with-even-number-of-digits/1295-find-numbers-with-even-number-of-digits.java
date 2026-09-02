class Solution {
    public int findNumbers(int[] nums) {
        int eveNum = 0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]<1) continue;
            if((int)(Math.log10(nums[i]))%2 == 1) eveNum++;
        }
        return eveNum;
    }
}