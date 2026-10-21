class Solution {
    public int[] getAverages(int[] nums, int k) {
        int size = nums.length;

        if(k == 0) return nums;
        
        long sum = 0;
        boolean status = false;

        int ans [] = new int[size];
        int divisor  = (k*2)+1;

        for(int i=0;i<size;i++){
            if((i-k)>= 0 && (i+k) < size){
                if(status){
                    sum += nums[i+k] - nums[i-k-1];
                }else{
                    sum = totalSum(nums,i-k,i+k);
                    status = true;
                }
                int val = (int)(sum/divisor);
                ans[i] = val;
            }else{
                ans[i] = -1;
            }
        }

        return ans;

    }

    public long totalSum(int nums[],int start,int end){
        long result = 0;

        for(int i= start;i<=end;i++){
            result += nums[i];
        }

        return result;
    }
}