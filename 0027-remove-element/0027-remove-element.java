class Solution {
    public int removeElement(int[] nums, int val) {
        LinkedList<Integer> list = new LinkedList<>();

        int j =0;
        for(int i:nums){
            if(i != val){
                nums[j] = i;
                j++;
            }
        }

        return j;
    }
}