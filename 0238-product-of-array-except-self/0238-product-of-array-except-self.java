class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int [] result = new int[size];

        int prefix = 1;
        for(int i=0;i<size;i++){
            result[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for(int j=size -1;j>=0;j--){
            result[j] *= suffix;
            suffix *= nums[j];
        }

        return result;
    }
}