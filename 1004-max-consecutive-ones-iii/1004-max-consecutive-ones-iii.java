class Solution {
    public int longestOnes(int[] nums, int k) {
        int size = nums.length;

        if(size == k) return k;
        if(size == 1 && k > 0) return 1;

        int max = 0;

        for(int i= 0; i<size ;i++){
            int j = i;
            int temp = 0;

            while(j<size){
                
                if(nums[j]==0){
                    temp++;
                }
                if(temp > k) {
                
                    break;
                }
                j++;
            }
            max = Math.max(max,j-i);
        }

        return max;
    }
}