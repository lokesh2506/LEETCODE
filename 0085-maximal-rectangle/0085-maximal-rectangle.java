class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int maxArea = 0;


        int heights [] = new int[cols];

        for(int i=0;i<rows;i++){
            for(int j = 0;j< cols ;j++){
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }

            maxArea = Math.max(maxArea,largestRectangle(heights));
        }

        return maxArea;

    }

    public int largestRectangle(int [] heights){
        int n = heights.length;

        int maxArea = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i<=n;i++){
            int curr = (i == n) ? 0 : heights[i];

            while(!stack.isEmpty() && heights[stack.peek()] > curr){
                int index = stack.pop();

                int height = heights[index];

                int width;

                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = i - stack.peek() - 1;
                }

                int area = width * height;

                maxArea = Math.max(maxArea,area);
            }

            stack.push(i);
        }

        return maxArea;
    }
}