class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = piles[0]; // 3 initially 

        int ans = right;

        for(int i=0;i<piles.length;i++){
            right = Math.max(right,piles[i]); // 11
        }

        // 11 speed koko can ate bananas 
        // but we need to find the minium speed;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(kokoCanEat(piles,h,mid)){
                ans = mid;
                right = mid -1;
            }else{
                left = mid+1;
            }
        }

        return ans;
    }

    public boolean kokoCanEat(int [] piles, int hours , int speed){
        long result  = 0;
        for(int i=0;i<piles.length;i++){
            // result += Math.ceil((double)piles[i]/speed);

            result += (piles[i] + speed - 1) / speed;

            if(result > hours) return false;
        }
        return true;
    }
}