class Solution {
    public static boolean valid(char[][] board,int col,int row,int n){
         //for left attact
         int r,c;

         r=row;
         c=col;
         while(c>=0){
            if(board[r][c] == 'Q') return false;
            c--;
         }

         //for diagonal upward
         r=row;
         c=col;
         while(r>=0 && c >=0 )
         {
            if(board[r][c] == 'Q') return false;
            r--;
            c--;
         }

         //for diagonal downward
         r=row;
         c=col;
         while(r<n && c>=0){
            if(board[r][c] == 'Q') return false;
            r++;
            c--;
         }

         return true;
    }

    public static void rec(char[][] board,List<List<String>> list ,int n,int col)
    {
        if(col == n)
        {
            list.add(convert(board));
            return;
        }
        for(int row = 0; row<n;row++)
        {
            if(valid(board,col,row,n))
            {
                board[row][col] = 'Q';
                rec(board,list,n,col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static List<String> convert(char[][] board){
        List<String> stringBoard = new ArrayList<>();
        for(int i = 0;i<board.length;i++){
            String s = new String(board[i]);
            stringBoard.add(s);
        }
        return stringBoard;
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++)
            {
                board[i][j] = '.';
            }
        }
        List<List<String>> list = new ArrayList<>();
        rec(board,list,n,0);
        return list;
    }
}