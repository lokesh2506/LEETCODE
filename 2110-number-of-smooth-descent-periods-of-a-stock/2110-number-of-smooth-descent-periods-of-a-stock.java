class Solution {
    public long getDescentPeriods(int[] prices) {
        int size = prices.length;

        long count = 1;

        int j = 0;
        for(int i=1;i<size;i++){
            if(prices[i] > prices[i-1]){
                j = i;
            }else if(prices[i-1] - prices[i] != 1){
                j = i;
            }

            count += i-j+1;
        }

        return count;
    }
}