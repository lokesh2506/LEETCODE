class Solution {
    public int minSwaps(int[] nums) {
        // Count the total number of 1s in the array.
        // Use that count as the fixed window size k.
        // Find the window containing the maximum number of 1s.
        // The minimum swaps required equals the number of 0s inside that window.

        int size = nums.length;
        int ones = 0;
        // step 1 - cnt no of 1
        for(int num : nums){
            if(num == 1) ones++;
        }

        // step 2 - Initailise window in 0-ones size 
        int count = 0;
        for(int i=0;i<ones;i++){
            if(nums[i] == 1) count++;
        }
        int maxOnes = count;

        // step 3 - move the window to find max ones

        for(int i = ones;i<size+ones;i++){
            // outgoing
            if(nums[(i-ones)%size] == 1){
                count--;
            }
            // incoming
            if(nums[i%size] == 1){
                count++;
            }

            maxOnes = Math.max(maxOnes,count);
        }


        return ones - maxOnes;


    }
}