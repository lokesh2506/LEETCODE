class Solution {
    public int countGoodRotations(int[] nums) {


        int size = nums.length;

        long firstSum = 0,secondSum = 0;
        int count = 0;

        for(int i=0;i<size/2;i++){
            // first sum 
            firstSum += nums[i];

            // second sum
            secondSum += nums[(size/2)+i];
        }

        if(firstSum > secondSum)  count++;

        int half = size/2;
        for (int i = 0; i < size - 1; i++) {

            int firstNum = nums[i];
            int secondNum = nums[(i + half) % size];

            // First half loses firstNum and gains secondNum
            firstSum = firstSum - firstNum + secondNum;

            // Second half does the opposite
            secondSum = secondSum + firstNum - secondNum;

            if (firstSum > secondSum) {
                count++;
            }
        }

        return count;


    }
}