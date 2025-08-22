class Solution {
    public int minimumArea(int[][] grid) {
        int minRow=grid.length,maxRow = -1;
        int minCol = grid[0].length, maxCol = -1;
        for(int r=0;r<grid.length;r++)
        {
            for(int c = 0;c<grid[0].length;c++)
            {
                if(grid[r][c] == 1)
                {
                    minRow = Math.min(minRow,r);
                    maxRow = Math.max(maxRow,r);
                    minCol = Math.min(minCol,c);
                    maxCol = Math.max(maxCol,c);
                }
            }
        }
        return (maxRow-minRow+1) * (maxCol-minCol+1);
        
    }
}