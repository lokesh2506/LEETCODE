
import java.util.*;

class Solution {
    public boolean find132pattern(int[] nums) {

        int n = nums.length;
        Stack<Integer> stack = new Stack<>();


        // 132 pattern -> 1 2 3
        int second = Integer.MIN_VALUE;

        for(int i = n -1 ;i>=0;i--){
            if(nums[i] < second){
                return true;  
                //second = 2
            }

            while(!stack.isEmpty() && stack.peek() < nums[i]){
                second = stack.pop();
            }

            stack.push(nums[i]);
        }
        
        return false;
    }
}
