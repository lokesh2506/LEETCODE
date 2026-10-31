class Solution {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }

        solve(board, 0, ans, n);

        return ans;
    }

    public void solve(char[][]board,int row,List<List<String>> ans ,int n){
        if(n == row){
            List<String> result = new ArrayList<>();

            for(int i=0;i<n;i++){
                result.add(new String(board[i]));
            }

            ans.add(result);
        }


        for(int col = 0;col<n;col++){
            if (isSafe(row,col,board,n)){
                board[row][col] = 'Q';
                solve(board, row+1, ans, n);
                board[row][col] = '.';
            }
        }

    }

    public boolean isSafe(int row, int col, char[][] board, int n){

        // check for the same column 
        for(int r = 0; r < row;r++){
            if(board[r][col] == 'Q'){
                return false;
            }
        }

        // check for the left upper diagonal
        for(int r = row-1, c = col-1; r>=0 && c>=0 ; r--,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // check for the right upper diagonal
        for(int r = row-1, c = col+1; r>=0 && c<n ; r--,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
    }
}