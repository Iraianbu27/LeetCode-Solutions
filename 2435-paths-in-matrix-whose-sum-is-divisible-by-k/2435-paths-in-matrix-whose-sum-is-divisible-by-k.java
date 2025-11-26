class Solution {
    int mod = (int)1e9+7;
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length; //row
        int n = grid[0].length; //col
        int total = 0;
        //finding total
        for(int[] arrays:grid){
            for(int array:arrays){
                total += array;
            }
        }
        int[][][] dp = new int[m][n][k];
        for(int row = 0;row<m;row++){
            for(int col = 0;col<n;col++){
                for(int path = 0;path<k;path++){
                    if(row == 0 && col == 0){
                        if((path+grid[row][col])%k == 0){
                            dp[0][0][path] = 1;
                        } 
                    }
                    else{
                            int pick = 0,notPick = 0;
                            if(row >0)pick = dp[row-1][col][(path+grid[row][col])%k];
                            if(col >0)notPick = dp[row][col-1][(path+grid[row][col])%k];
                            dp[row][col][path] = (pick + notPick)%mod;         
                        }
                }
            }
        }
        return dp[m-1][n-1][0];


    }
}