class Solution {
    public int upperBound(int [] starts,int target){
        int left = 0;
        int right = starts.length;

        while(left < right){
            int mid = left +(right-left)/2;

            if(starts[mid] <= target){
                left = mid+1;
            }else{
                right = mid;
            }
        }

        return left;
    }

        public int lowerBound(int [] ends,int target){
        int left = 0;
        int right = ends.length;

        while(left < right){
            int mid = left +(right-left)/2;

            if(ends[mid] < target){
                left = mid+1;
            }else{
                right = mid;
            }
        }

        return left;
    }


    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int size = flowers.length;

        int starts [] = new int[size];
        int ends[] = new int[size];

        int ans [] = new int[people.length];

        for(int i=0;i<size;i++){
            starts[i] = flowers[i][0];
            ends[i] = flowers[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        for(int i=0;i<people.length;i++){
            int started  = upperBound(starts,people[i]);
            int finished = lowerBound(ends,people[i]);

            ans[i] = started  - finished;
        }

        return ans;
    }
}