class Solution {
    public int[] buildArray(int[] nums) {
        int arrLen = nums.length;
        int permutationArr[] = new int[arrLen];

        for(int i=0;i<arrLen;i++){
            permutationArr[i] = nums[nums[i]];
        }

        return permutationArr;
    }
}