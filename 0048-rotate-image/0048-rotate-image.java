class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
       //1.Transporse the matrix
       for(int i = 0;i<n-1;i++)
       {
        for(int j = i+1;j<n;j++)
        {
            int thVar = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = thVar;
        }
       }
       //2.reverse every row
       for(int i = 0;i<n;i++)
       {
        int l=0,r=n-1;
        while(l<=r)
        {
            int thVar = matrix[i][l];
            matrix[i][l] = matrix[i][r];
            matrix[i][r] = thVar;
            l++;
            r--;
        }
       }
         
    }
}