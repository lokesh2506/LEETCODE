class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        int size = nums.length;
        for(int i=0;i<size;i++){
            if(nums[i] > 0){
                positive.add(nums[i]);
            }else{
                negative.add(nums[i]);
            }
        }

        int j=0;
        for(int i=0;i<size/2;i++){
            nums[j] = positive.get(i);
            nums[j+1] = negative.get(i);

            j+=2; 
        }


        return nums;
    }
}