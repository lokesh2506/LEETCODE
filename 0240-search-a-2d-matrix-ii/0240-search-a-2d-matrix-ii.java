class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rSize = matrix.length;
        int cSize = matrix[0].length;

        int row = 0;
        int col = cSize -1;

        while(row < rSize && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
        }

        return false;
    }
}