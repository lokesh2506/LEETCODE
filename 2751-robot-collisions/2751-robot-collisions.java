class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int size = positions.length;

        Integer[] indices = new Integer[size];

        for(int i = 0; i < size;i++){
            indices[i] = i;
        }

        // we need to sort indices based on the position 
        Arrays.sort(indices,(a,b) -> positions[a] - positions[b]);

        Stack<Integer> stack = new Stack<>();

        for(int index : indices){
            char ch = directions.charAt(index);

            if(ch == 'R'){
                stack.push(index);
            }else{
                // remove/health decrease the collided robot
                while(!stack.isEmpty() && healths[index] > 0 && directions.charAt(stack.peek()) == 'R'){
                    int rightMoving = stack.peek();

                    if(healths[rightMoving] == healths[index]){
                        healths[rightMoving] = 0;
                        healths[index] = 0;

                        stack.pop();
                    }else if(healths[rightMoving] > healths[index] ){
                        healths[rightMoving]--;
                        healths[index] = 0;
                    }else if(healths[rightMoving] < healths[index] ){
                        healths[index]--;

                        healths[rightMoving] = 0;
                        stack.pop();
                    }
                }

            }
        }


        List<Integer> ans = new ArrayList<>();
        for(int health : healths){
            if(health > 0) ans.add(health);
        }

        return ans;
    }
}