class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        //rewrite the  nums[i]+i+nums[j]-j
        int maxLeft = values[0];  // nums[i]+i ->  nums[0]+0 -> nums[0]
        int ans = 0;

        for(int j=1;j<values.length;j++){
            // Calculate score using the best previous place
            ans = Math.max(ans, maxLeft + values[j] - j);

            // Update the best left-side value for future pairs
            maxLeft = Math.max(maxLeft, values[j] + j);
        }

        return ans;
    }
}