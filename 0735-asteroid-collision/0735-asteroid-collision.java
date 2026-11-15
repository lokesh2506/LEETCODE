class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<asteroids.length;i++){
            int curr = asteroids[i];
            boolean alive = true;

            while(!stack.isEmpty() && alive && curr < 0 && stack.peek() > 0){
                if(stack.peek() == Math.abs(curr)){
                    alive = false;
                    stack.pop();  // 8 -8
                }else if(stack.peek() < Math.abs(curr)){
                    stack.pop(); // 2 -5
                }else{
                    alive = false; // 10 -5
                }
            }

            if(alive){
                stack.push(curr);
            }
            
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}