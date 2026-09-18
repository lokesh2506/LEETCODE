class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = low;
        int high = nums.length-1;

        // 0 to low-1 -> 0
        // low to mid-1 -> 1
        //high+1 to n-1 -> 2

        // mid-1  and high+1 bcoz it will cross (mid<=high)
        while(mid <= high){
            if(nums[mid]==1){
                mid++;
            }else if(nums[mid] == 0){
                nums[mid] = nums[low];
                nums[low] = 0;

                mid++;
                low++;
            }else{
                nums[mid] = nums[high];
                nums[high] = 2;

                high--;
            }
        }
    }
}