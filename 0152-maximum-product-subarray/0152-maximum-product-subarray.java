class Solution {
    public int maxProduct(int[] nums) {
        int size = nums.length;

        int max = Integer.MIN_VALUE;

        int prefix = 1;
        int suffix = 1;

        for(int i=0;i<size;i++){
            
            if(prefix == 0) prefix =1;
            if(suffix == 0) suffix =1;

            prefix *= nums[i];
            suffix *= nums[size-i-1];

            max = Math.max(max,Math.max(prefix,suffix));
        }

        return max;
    }
}