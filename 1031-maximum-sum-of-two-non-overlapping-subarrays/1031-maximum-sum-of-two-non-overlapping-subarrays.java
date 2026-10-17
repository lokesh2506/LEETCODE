
class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        return Math.max(
            maxSum(nums, firstLen, secondLen),
            maxSum(nums, secondLen, firstLen)
        );
    }

    public int maxSum(int[] nums, int L, int M) {
        int sumL = 0;
        int sumM = 0;

        // Initial windows
        for (int i = 0; i < L; i++) {
            sumL += nums[i];
        }

        for (int i = L; i < L + M; i++) {
            sumM += nums[i];
        }

        int maxL = sumL;
        int result = sumL + sumM;

        for (int i = L + M; i < nums.length; i++) {
            // Slide the M-length window
            sumM += nums[i] - nums[i - M];

            // Slide the L-length window
            sumL += nums[i - M] - nums[i - M - L];

            maxL = Math.max(maxL, sumL);
            result = Math.max(result, maxL + sumM);
        }

        return result;
    }
}
