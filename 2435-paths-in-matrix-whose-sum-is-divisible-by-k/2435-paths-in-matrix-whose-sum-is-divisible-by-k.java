class Solution {
    int mod = (int)1e9+7;
    public int recFunction(int[][] grid,int row,int col,int path ,int k,int[][][] dp){
        if(row < 0 || col < 0)return 0;
        if(row == 0 && col == 0){
            if((path+grid[row][col])%k == 0){
                return 1;
            } return 0;
        }
        if(dp[row][col][path] != -1)return dp[row][col][path];
        int pick = 0,notPick = 0;
        pick = recFunction(grid,row-1,col,(path+grid[row][col])%k,k,dp);
        notPick = recFunction(grid,row,col-1,(path+grid[row][col])%k,k,dp);
        return dp[row][col][path] = (pick + notPick)%mod;
    }
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
        //filling -1 
        for(int[][] arrays:dp){
            for(int[] array:arrays){
                Arrays.fill(array,-1);
            }
        }
        return recFunction(grid,m-1,n-1,0,k,dp);
    }
}