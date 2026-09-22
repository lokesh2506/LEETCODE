class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int size = nums.length;
        int product = 1;

        int count = 0;

        if(k<=1) return 0;

        int j=0;
        for(int i=0;i<size;i++){
            product *= nums[i];

            while(product >= k){
                product /= nums[j];
                j++;
            }

            count += (i-j+1);
        }


        return count;
    }
}