class Solution {
    public boolean valid(char[][] board, int r, int c, char val) {
        for(int i = 0; i < 9; i++) {
            if(board[r][i] == val) return false;
            if(board[i][c] == val) return false;
            if(board[3*(r/3) + i/3][3*(c/3) + i%3] == val) return false;
        }
        return true;
    }
    
    public boolean solve(char[][] board, int row, int col) {
        // Move to next row if we've finished current row
        if(col == 9) {
            row++;
            col = 0;
        }
        
        // Base case: all rows processed
        if(row == 9) return true;
        
        // Skip already filled cells
        if(board[row][col] != '.') {
            return solve(board, row, col + 1);
        }
        
        // Try values 1-9 for empty cell
        for(char c = '1'; c <= '9'; c++) {
            if(valid(board, row, col, c)) {
                board[row][col] = c;
                if(solve(board, row, col + 1)) return true;
                board[row][col] = '.'; // Backtrack
            }
        }
        
        return false;
    }
    
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
}