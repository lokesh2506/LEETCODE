class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int j=0;
        for(int i : nums){
            if(set.add(i)){
                nums[j] = i; 
                j++;
            }
            
        }

        return set.size();
    }
}