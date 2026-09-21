class Solution {
    public int longestOnes(int[] nums, int k) {
        int size = nums.length;

        int i=0,j=0;
        int count = 0;
        int max = 0;

        while(j<size && i<=j){
            if(count > k){
                if(nums[i]==0){
                    count--;
                }
                i++;
            }else{
                if(nums[j]==0){
                    count++;
                }
                j++;
            }

            if(count <= k) max = Math.max(max,j-i);
        }

        return max;
    }
}