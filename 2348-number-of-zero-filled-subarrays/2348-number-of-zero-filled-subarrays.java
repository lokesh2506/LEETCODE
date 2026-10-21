class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        long count  = 0;
        long continuousZero = 0;

        for(int num : nums){
            continuousZero = (num == 0) ? continuousZero + 1 : 0;
            count += continuousZero;
        }

        // [0,-9,6,-5,0,0,8,0,0,3,-3]
        // and -> 7

        // 1 -> 0.. -> 1 -> 2 -> 0.. -> 1 -> 2  
        // 1 + 0...0 + 1 + 2 + 0 + 1 + 2 + 0..0 -> total 7


        return count;
    }
}