class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int size = nums.length;
        int ans[] = new int[size];

        Stack<Integer> stack = new Stack<>();

        // right to left 
        for(int i = 2 *(size-1) ;i>=0;i--){
            int index = i % size; // circular rotation

            while(!stack.isEmpty() && stack.peek() <= nums[index]){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[index] = -1;
            }else{
                ans[index] = stack.peek();
            }

            stack.push(nums[index]);
        } 

        return ans;
    }
}