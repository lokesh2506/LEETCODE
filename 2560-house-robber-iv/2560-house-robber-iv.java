class Solution {
    public boolean canRob(int[] nums, int k,int amount){
        int count = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] <= amount){
                count++;
                i++; // we can't rob adjacent house
            }
        }

        return count >= k;
    }
    public int minCapability(int[] nums, int k) {
        int left = 1;
        int right = Arrays.stream(nums).max().getAsInt();

        int ans = right;

        while(left <= right){
            int mid = left+(right-left)/2;

            if(canRob(nums,k,mid)){
                right = mid -1;
                ans = mid;
            }else{
                left = mid +1;
            }
        }

        return ans;
    }
}