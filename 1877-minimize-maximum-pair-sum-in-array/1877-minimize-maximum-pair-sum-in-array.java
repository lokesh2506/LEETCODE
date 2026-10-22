class Solution {
    public int minPairSum(int[] nums) {
        // int size = nums.length;

        // Arrays.sort(nums);

        // int max = 0;

        // for(int i = 0;i <size/2; i++){
        //     max = Math.max(max,nums[i]+nums[size -1 - i]);
        // }

        // return max;

        int freq[] = new int[100001];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            freq[nums[i]]++;
        }

        int left = min;
        int right = max;

        int maxPair = 0;

        while(left <= right){
            if(freq[left] == 0){
                left++;
            }else if(left <= right && freq[right] == 0){
                right--;
            }else{
                maxPair = Math.max(maxPair,left+right);
                freq[left]--;
                freq[right]--;
            }
        }

        return maxPair;
    }
}