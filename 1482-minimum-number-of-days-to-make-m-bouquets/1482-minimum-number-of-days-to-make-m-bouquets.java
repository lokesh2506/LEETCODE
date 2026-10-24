class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length)  return -1;

        int left = 1;
        int right = 0;

        for(int num : bloomDay){
            right = Math.max(right,num);
        }

        int ans = right;

        while(left <= right){
            int mid = left+(right-left)/2;

            if(canMakeBouquets(bloomDay,m,k,mid)){
                ans = mid;
                right = mid -1;
            }else{
                left = mid+1;
            }
        }

        return ans;
    }

    public boolean canMakeBouquets(int [] bloomDay,int m,int k,int day){
        int flower = 0;
        int bouquets  = 0;

        for(int bloom : bloomDay){
            if(bloom <= day){
                flower++;

                if(flower == k){
                    bouquets++;
                    flower =0;

                    if(bouquets >= m){
                        return true;
                    }
                }

            }else{
                flower = 0;
            }

            // if(bouquets >= m){
            //     return true;
            // }
        }

        return false;
    }
}