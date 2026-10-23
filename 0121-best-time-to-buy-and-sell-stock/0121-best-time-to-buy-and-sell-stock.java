class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;


        int minArr[] = new int[size];
        minArr[0] = prices[0];
        int maxArr[] = new int[size];
        maxArr[size-1] = prices[size-1];

        for(int i = 1;i<size;i++){
            minArr[i] = Math.min(minArr[i-1],prices[i]);
            maxArr[size - i - 1] = Math.max(maxArr[size-i],prices[size - i - 1]);
        }

        int maxPrice = 0;

        for(int i=0;i<size;i++){
            maxPrice = Math.max(maxPrice,maxArr[i] - minArr[i]);
        }

        return maxPrice;
    }
}