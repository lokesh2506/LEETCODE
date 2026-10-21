class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for(int weight : weights){
            left = Math.max(left,weight);
            right += weight;
        }

        int ans = right;

        // if we have day = 1 we will ship all the things in 1 days so sum(arr) is as of now it is minimum

        while(left <= right){
            int mid = left + (right-left)/2;

            if(canShip(weights,days,mid)){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid+1;
            }
        }

        return ans;
    }

    public boolean canShip(int [] weights, int days,int capacity){
        int usedDay = 1; //day always start wiith 1
        long currLoad = 0;

        for(int i=0;i<weights.length;i++){
            if(currLoad + weights[i] > capacity){
                usedDay += 1;
                currLoad = weights[i];

                if(usedDay > days){
                    return false;
                }
            }else{
                currLoad += weights[i];
            }
        }
        return true;

    }
}