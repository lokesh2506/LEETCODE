class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int concatArr[] = new int[size*2];

        for(int i=0;i<size;i++){
            concatArr[i] = nums[i];
            concatArr[i+size] = nums[i];
        }

        return concatArr;
    }
}