public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (backtrack(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean backtrack(char[][] board, String word, int i, int j, int index) {
        if(index == word.length()) {
            return true;
        }
        
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || 
           board[i][j] != word.charAt(index)) {
            return false;
        }
        
        // Mark as visited by modifying the board
        char temp = board[i][j];
        board[i][j] = '#';  // Use a character that won't match
        
        boolean found = backtrack(board, word, i+1, j, index+1) ||
                        backtrack(board, word, i-1, j, index+1) ||
                        backtrack(board, word, i, j+1, index+1) ||
                        backtrack(board, word, i, j-1, index+1);
        
        // Restore original character (backtrack)
        board[i][j] = temp;
        
        return found;
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