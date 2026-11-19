class Solution {
    public int maximumScore(int[] nums, int k) {
        int size = nums.length;

        int left = k;
        int right = k;

        int min = nums[k];
        int maxScore = nums[k];

        while(left > 0 || right < size - 1){
            // nums[left - 1] >= nums[right + 1]
            // when left >0 or right <= size-1 mean the above condition false for neighbour check 
            

            // Move toward rights
            if(left == 0){
                right++;
                min = Math.min(min,nums[right]);
            }else if(right == size-1){ // move toward left
                left--;
                min = Math.min(min,nums[left]);
            }else if(nums[left - 1] >= nums[right + 1]){
                left--;
                min = Math.min(min,nums[left]);
            }else{
                right++;
                min = Math.min(min,nums[right]);
            }


            // calculate the max score

            int length = right - left + 1; // 7  

            int score = min * length;

            maxScore = Math.max(maxScore,score);

        }


        return maxScore;
    }
}