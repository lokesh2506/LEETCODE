class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans = new int [nums.length];
        
        int i =0 ,j = 0;
        while(i<n){
            ans[j] = nums[i];
            ans[j+1]= nums[i+n];
            j+=2;
            i++;
        }

        return ans;
    }
}