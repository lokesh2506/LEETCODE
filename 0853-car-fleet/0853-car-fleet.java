class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        int cars[][] = new int[n][2];

        for(int i=0;i<n;i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars,(a,b) -> b[0] - a[0]);// decending order sorting 
        // top distance on the top

        // formula for time = (target - currPosition) / speed;

        Stack<Double> stack = new Stack<>();

        for(int i=0;i<n;i++){
            double time = (double) (target - cars[i][0]) / cars[i][1];

            while(stack.isEmpty() || stack.peek() < time){
                stack.push(time);
            }
        }

        return stack.size();
    }
}