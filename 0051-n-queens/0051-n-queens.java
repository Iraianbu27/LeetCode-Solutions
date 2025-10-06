class Solution {
    public boolean valid(char[][] board,int row,int col,int n){
        int r = row;
        int c = col;
        //left
        while(c>=0){
            if(board[r][c] =='Q'){
                return false;
            }
            c--;
        }

        //diagonal upward
        r = row;
        c = col;
        while(r>=0 && c>= 0){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
            c--;
        }

        //diagonal downward
        r=row;
        c=col;
        while(c >=0 && r<n){
            if(board[r][c] =='Q'){
                return false;
            }
            r++;
            c--;
        }

        return true;
    }

    public List<String> convert(char[][] board,int n){
        List<String> list = new ArrayList<>();
        for(char[] row:board){
            String s = new String(row);
            list.add(s);
        }
        return list;
    }


    public void backtracking(char[][] board,List<List<String>> list,int row,int col,int n){
        //basecase
        if(col == n){
            list.add(convert(board,n));
            return;
        } 
        for(int r = 0;r<n;r++){
            if(valid(board,r,col,n)){
                board[r][col] ='Q';
                backtracking(board,list,r,col+1,n);
                board[r][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> list = new ArrayList<>();
        backtracking(board,list,0,0,n);
        return list;
    }
}