class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // Empty array check
        int rowSize = image.length;
        if (rowSize == 0 ) return new int[0][0];

        // code login
        int columnSize = image[0].length;
        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < (columnSize + 1)/2; j++){
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][columnSize - j - 1] ^ 1;
                image[i][columnSize - j - 1] = temp;
            }
        }

        return image;

    }
}