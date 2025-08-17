import java.util.*;
class Solution {

    public static int rec(int col,int n,char[][] board)
    {
        if(col == board.length)
        {
            
           
            return 1;
        }
        int count = 0;

        for(int row = 0;row<n;row++)
        {
            if(validate(board,row,col)){
                board[row][col] =  'Q';
                count += rec(col + 1,n,board);
                board[row][col] = '.';
            }
        }
    return count;

    }

    public static boolean validate(char[][] board,int row,int col)
    {
        int r,c;

        //left 
        r = row;
        c=col;
        while(c >= 0)
        {
            
            if(board[r][c] == 'Q') return false;
            c--;

        }

        //left-diagonal
                r = row;
        c=col;
        while(r>=0 && c>=0){
            if(board[r][c] =='Q' ) return false;
            r--;
            c--;
        }
        //right diagonal
                r = row;
        c=col;
        while(r < board.length && c >=0)
        {
            if(board[r][c] =='Q') return false;
            r++;
            c--;
        }

        return true;
    }


    public int totalNQueens(int n) {
        // int count = 0;
        char[][] board = new char[n][n];
        for(int i = 0;i<board.length;i++){
            for(int j =0;j<board.length;j++){
                board[i][j] =  '.';
            }
        }

        
        
        return   rec(0,n,board);
    }
}