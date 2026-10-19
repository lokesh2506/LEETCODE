class Solution {
    public int minimumAverageDifference(int[] nums) {
        int size = nums.length;

        long totalSum = 0;

        for(int num:nums) totalSum += num;

        long min = Integer.MAX_VALUE;
        int index = 0;
        long leftSum = 0;

        for(int i=0;i<size;i++){
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;

            long result = Math.abs(
                (leftSum / (i + 1)) -
                ((size - i - 1) == 0 ? 0 : (rightSum / (size - i - 1)))
            );

            if(min > result){
                min = result;
                index = i;
            }
        }
        return index;
    }
}