class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int size = nums.length;
        int ans[] = new int[size-k+1];

        Deque<Integer> deque = new LinkedList<>();

        for(int i=0;i<size;i++){
            while(!deque.isEmpty() && (deque.peekFirst() <= i-k) ){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]< nums[i]){
                deque.pollLast();
            }
            deque.addLast(i);
           
           if(i>= k-1){
            ans[i-k+1] = nums[deque.peekFirst()];
           }
        }

        return ans;
    }
}