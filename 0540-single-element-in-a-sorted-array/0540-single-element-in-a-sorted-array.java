class Solution {
    public int singleNonDuplicate(int[] nums) {
        // if pair means first appearance is at even positon and second appearance is in odd position

        // if not  means we need to move to right otherwise left = mid +1
        
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = left + (right - left)/2;

            if( (mid % 2 == 0 && nums[mid] == nums[mid+1]) ||
                (mid % 2 == 1 && nums[mid] == nums[mid-1])
            ){
                left = mid+1;
            }else{
                right = mid;
            }
        }

        return nums[left];
    }
}