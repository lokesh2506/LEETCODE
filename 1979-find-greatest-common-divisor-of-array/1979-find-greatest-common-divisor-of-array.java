class Solution {
    public int GCD(int min,int max){
        int gcd = 0;
        while(max % min != 0){
           int temp = max % min;
           max = min;
           min = temp; 
        }
        return min;
    }
    public int findGCD(int[] nums) {
        int min = nums[0],max = nums[0];
        for(int num : nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        return GCD(min,max);
    }
}