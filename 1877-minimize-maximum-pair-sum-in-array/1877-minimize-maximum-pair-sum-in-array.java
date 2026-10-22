class Solution {
    public int minPairSum(int[] nums) {
        int size = nums.length;

        Arrays.sort(nums);

        int max = 0;

        for(int i = 0;i <size/2; i++){
            max = Math.max(max,nums[i]+nums[size -1 - i]);
        }

        return max;
    }
}