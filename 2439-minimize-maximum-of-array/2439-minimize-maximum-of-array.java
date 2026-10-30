class Solution {
    public int minimizeArrayValue(int[] nums) {
        int left = nums[0];
        int right = 0;
        int ans = right;

        for (int num : nums) {
            right = Math.max(right, num);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canMake(nums, mid)) {
                ans = mid;       // Store possible answer
                right = mid - 1; // Search smaller
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean canMake(int[] nums, int maxAllowed) {
        long prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            long capacity = (long) maxAllowed * (i + 1);

            if (prefixSum > capacity) {
                return false;
            }
        }

        return true;
    }
}