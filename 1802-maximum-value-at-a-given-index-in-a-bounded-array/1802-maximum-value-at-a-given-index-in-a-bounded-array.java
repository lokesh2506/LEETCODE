class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int left = 1;
        int right = maxSum;

        int ans = left;

        while(left <= right){
            int mid  = left + (right-left)/2;

            if(isMaxValue(n,index,maxSum,mid)){
                left = mid+1;
                ans = mid;
            }else{
                right = mid-1;
            }
        }

        return ans;
    }

    public boolean isMaxValue(int n, int index, int maxSum,int mid){
        long leftSum = getSideSum(index,mid);

        long rightSum = getSideSum(n - 1 - index,mid);

        // if n = 10 indx = 2  mid = 4
        //  leftSum (2,4)
        // rightSum (10-1-2,4)->(7,4)

        //  why 7 
        // 0 1 2 3 4 5 6 7 8 9 -> if 4 is in 2nd position means 
        // left sum 0 and  1 
        // right sum 3-9 -> 7 itertaion 

        long sum = leftSum + mid + rightSum;

        return sum <= maxSum;
    }

    public  long getSideSum(int count,int mid){
int decreasing = Math.min(count, mid - 1);

    long sum = (long) decreasing * (2L * mid - decreasing - 1) / 2;

    sum += count - decreasing;

    return sum;

    }
}