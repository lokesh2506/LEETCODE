class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rSize = matrix.length;
        int cSize = matrix[0].length;

        // virtually imagine 2D array as a 1D
        int left = 0;
        int right = (rSize*cSize)-1;

        while(left <= right){
            int mid = left+(right-left)/2;

            // Now we need to turn the virtual 1D array to the 2D array index

            int row = mid / cSize;
            int col = mid % cSize;

            if(target == matrix[row][col]){
                return true;
            }else if(target < matrix[row][col]){
                right = mid -1;
            }else{
                left = mid +1;
            }
        } 


        return false;       

    }
}