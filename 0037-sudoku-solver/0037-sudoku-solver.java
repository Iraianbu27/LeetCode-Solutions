class Solution {
    public boolean valid(char[][] board,int r,int c,char val ){
        for(int i =0;i<9;i++){
            if(board[r][i] == val){
                return false;
            }
            if(board[i][c] == val) return false;
            if(board[3*(r/3) + i/3][3*(c/3) + i%3] == val) return false;
        }
        return true;
    }
    public boolean solve(char[][] board){
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j] == '.' ){
                    for(char c = '1';c<='9';c++){
                        if(valid(board,i,j,c)){
                            board[i][j] = c;
                            if(solve(board) == true){
                                return true;
                            }
                            else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true; //base case
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}