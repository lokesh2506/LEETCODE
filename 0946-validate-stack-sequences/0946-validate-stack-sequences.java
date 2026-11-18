class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();

        int size = popped.length;

        int j = 0;
        for(int i=0;i<size;i++){
            int val = popped[i];

            if(!stack.isEmpty() && stack.peek() == val){
                stack.pop();
            }else{
                while(j<size && val != pushed[j]){
                    stack.push(pushed[j]);
                    j++;
                }

                if(j<size && val == pushed[j]){
                    j++;
                }
            }
        }

        return stack.isEmpty();
    }
}