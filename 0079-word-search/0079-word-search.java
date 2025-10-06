public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];
        boolean result = false;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    result = backtrack(board, word, visited, i, j, 0);
                    if (result) return true;
                }
            }
        }
        
        return false;
    }
    private boolean backtrack(char[][] board, String word, boolean[][] visited, int i, int j , int index)
    {
        if(word.length() == index)
        {
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>= board[0].length || board[i][j] != word.charAt(index) || visited[i][j] == true){
            return false;
        }
        
        visited[i][j] = true;
        if(
        backtrack(board,word,visited,i+1,j,index + 1) ||
        backtrack(board,word,visited,i,j-1,index + 1) ||
        backtrack(board,word,visited,i-1,j,index + 1) ||
        backtrack(board,word,visited,i,j+1,index + 1) ){
            visited[i][j] = false;
            return true;
        }
    visited[i][j] = false;
    return false;
        
    }
    
   
}



// class Solution {

//     public static void validate(char[][] board,int row, int col, String word,int index){
    
//         for(int i=0;i<row;i++){
//             for(int j = 0;j<col;j++){
//                 if(board[i][j] == word.charAt(index)){
                
//                  lexigo(board,i,j,word,row,col,index);

//             }
//             }

//         }
//     }

//     public static void lexigo(char[][] board, int rowPresent, int colPresent, String word,int row,int col,int index)
//     {
//         down(board,rowPresent,colPresent,word,row,col,index);
//         left(board,rowPresent,colPresent,word,row,col,index);
//         top(board,rowPresent,colPresent,word,row,col,index);
//         right(board,rowPresent,colPresent,word,row,col,index);

//     }

//     public static boolean down(char[][] board, int rPres, int cPres,String word,int row, int col , int index){
//         if(!(rPresent < row)){
//             return ;
//         }

//     }


    
//     public static void rec(char[][] board,String word,int rowEnd, int colEnd)
//     {

         
//           return (validate(board,row,col,word,0))

         


//     }

//     public boolean exist(char[][] board, String word) {
//         int row = board.length();
//         int col = board[0].length();
//        return  rec(board,word,row,col);
//     }
// }


// //int r,c;
//         // r=rowPresent;
//         // c = colPresemt;

//         // if(word == ""){
//         //     return true;
//         // }

//         // //down
//         // while(r + 1<=row && board[r+1][col] == word.charAt(index + 1))
//         // {
//         //      board[r][c] = '.';
//         //      lexigo(board,r+1,c,word.remove(index),row,col,index + 1);
//         //      board[r][c] = word.charAt(index)
//         // }

//         // //left
//         // r=rowPresent;
//         // c = colPresent;
//         // while(c - 1 >= 0 && board[r][c-1] == word.charAt(index +1))
//         // {
//         //     board[r][c] = '.';
//         //     lexigo(board,r,c-1,word.remove(index),row,col,index + 1);
//         //     board[r][c] = word.charAt(index);
//         // }

//         // //up
//         // r=rowPresent;
//         // c = colPresent;
//         // while(r-1 >= 0 && board[r-1][c] == word.charAt(index +1))
//         // {
//         //     board[r][c] = '.';
//         //     lexigo(board,r-1,c,word.remove(index),row,col,index + 1);
//         //     board[r][c] = word.charAt(index);
//         // }

//         // //right
//         // r=rowPresent;
//         // c = colPresent;
//         // while(c+1 <=col && board[r[c+1] == word.charAt(index +1))
//         // {
//         //     board[r][c+1] = '.';
//         //     lexigo(board,r,c+1,word.remove(index),row,col,index + 1);
//         //     board[r][c+1] = word.charAt(index);
//         // }