class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if(k==1) return nums;

        int size = nums.length;

        int ans[] = new int[size - k +1];
        
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0;i<size;i++){
            while(!deque.isEmpty() && nums[deque.peekLast()] != nums[i]-1){
                deque.clear();
            }

            while(!deque.isEmpty() && deque.peekFirst() <= i-k){
                deque.pollFirst();
            }

            deque.addLast(i);

            if(i >= k-1){
                if(deque.size() == k){
                    ans[i-k+1] = nums[deque.peekLast()];
                }else{
                    ans[i-k+1] = -1;
                }
            }


        }



        return ans;
    }
}