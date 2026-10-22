class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        int maxLen = 0;

        while(i< nums1.length && j < nums2.length){
            if(i>j){
                j++;
                if(j >= nums2.length) return maxLen;
            }
            if(nums1[i] <= nums2[j]){
                maxLen = Math.max(maxLen,j-i);
                j++;
            }else{
                i++;
            }
        }

        return maxLen;
    }
}