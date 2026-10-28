class Solution {

    public boolean canPlace(int[] position, int m,int distance){
        int lastPosition = position[0];
        int placedBalls = 1;

        for(int i=1;i<position.length;i++){
            if(position[i] - lastPosition >= distance){
                placedBalls++;
                lastPosition = position[i];
            }

            if(placedBalls >= m) return true;
        }

        return false;
    }
    public int maxDistance(int[] position, int m) {
        int size = position.length;

        Arrays.sort(position);

        int left = 1;
        int right = position[size-1];

        int ans = left;

        while(left <= right){
            int mid = left+(right-left)/2;

            if(canPlace(position,m,mid)){
                left = mid+1;
                ans = mid;
            }else{
                right = mid -1;
            }
        }

        return ans;
    }
}