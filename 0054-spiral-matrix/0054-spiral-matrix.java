class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0 , bottom = matrix.length-1;
        int left = 0 , right = matrix[0].length-1;

        List<Integer> list = new ArrayList<>();

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int j = top;j<= bottom;j++){
                list.add(matrix[j][right]);
            }
            right--;

            if(top <= bottom){ //uneven length 3*4 matrix
                for(int k = right; k >= left;k--){
                    list.add(matrix[bottom][k]);
                }
                bottom--;
            }

            if(left<=right){ //uneven length 3*4 matrix
                for(int l = bottom; l>=top;l--){
                    list.add(matrix[l][left]);
                }
                left++;
            }

        }

        return list;
    }
}