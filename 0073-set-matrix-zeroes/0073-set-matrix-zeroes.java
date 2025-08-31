class Solution {
    public void setZeroes(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;   
    int[] arrRow = new int[m];
    int[] arrCol = new int[n];

    for(int row = 0;row<m;row++){
        for(int col= 0;col<n;col++)
        {
            if(matrix[row][col] == 0)
            {
                arrRow[row] = -1;
                arrCol[col] = -1;
            }
        }
    }

    for(int i = 0;i<m;i++)
    {
        for(int j = 0;j<n;j++)
        {
            if(arrRow[i]==-1 || arrCol[j] == -1)
            {
                matrix[i][j] = 0;
            }
        }
    }


    }
}
//EDGE CASE
//multiple 0's in same row or col 
// if another 0 spotted in row while converting everything -1 just continue if it is 0
//BRUTE FORCE
//   int m = matrix.length;
//         int n = matrix[0].length;
//         for(int row = 0;row<m;row++)
//         {
//             for(int col = 0;col<n;col++ )
//             {
//                 if(matrix[row][col] == 0  )
//                 {
                     
//                         for(int iR = 0;iR<m;iR++)
//                         {
//                             if(matrix[iR][col] == 0)
//                             {
//                                 continue;
//                             }
//                             matrix[iR][col] = -11;
//                         }
//                         for(int jC = 0;jC<n;jC++)
//                         {
//                             if(matrix[row][jC] == 0) continue;
//                             matrix[row][jC] = -11;
//                         }
//                 }
//             }
//         }

//         for(int i = 0;i<m;i++)
//         {
//             for(int j = 0;j<n;j++)
//             {
//                 if(matrix[i][j] == -11)
//                 {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }