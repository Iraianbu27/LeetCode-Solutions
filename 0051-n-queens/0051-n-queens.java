class Solution {
    // public boolean valid(char[][] board,int row,int col,int n){
    //     int r = row;
    //     int c = col;
    //     //left
    //     while(c>=0){
    //         if(board[r][c] =='Q'){
    //             return false;
    //         }
    //         c--;
    //     }

    //     //diagonal upward
    //     r = row;
    //     c = col;
    //     while(r>=0 && c>= 0){
    //         if(board[r][c] == 'Q'){
    //             return false;
    //         }
    //         r--;
    //         c--;
    //     }

    //     //diagonal downward
    //     r=row;
    //     c=col;
    //     while(c >=0 && r<n){
    //         if(board[r][c] =='Q'){
    //             return false;
    //         }
    //         r++;
    //         c--;
    //     }

    //     return true;
    // }

    public List<String> convert(char[][] board,int n){
        List<String> list = new ArrayList<>();
        for(char[] row:board){
            String s = new String(row);
            list.add(s);
        }
        return list;
    }


    public void backtracking(char[][] board,List<List<String>> list,int col,int n,int[] left,int[] lowDia,int[] upDia){
        //basecase
        if(col == n){
            list.add(convert(board,n));
            return;
        } 
        for(int r = 0;r<n;r++){
            if(left[r] == 0 && upDia[r+col] == 0 && lowDia[n-1 + col-r] == 0){
                left[r] = 1;
                upDia[r+col] = 1;
                lowDia[n-1 + col-r] = 1;
                board[r][col] ='Q';
                backtracking(board,list,col+1,n,left,lowDia,upDia);
                board[r][col] = '.';
                left[r] = 0;
                upDia[r+col] = 0;
                lowDia[n-1 + col-r] = 0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        int[] leftBoard = new int[n];
        int[] lowerDiagonal = new int[2*n-1];
        int[] upperDiagonal = new int[2*n-1];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> list = new ArrayList<>();
        backtracking(board,list,0,n,leftBoard,lowerDiagonal,upperDiagonal);
        return list;
    }
}