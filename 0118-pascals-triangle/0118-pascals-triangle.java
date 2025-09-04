import java.util.*;
class Solution {
    public List generateCol(int row)
    {
        List<Integer> rowMatrix = new ArrayList<>();
        rowMatrix.add(1);
        int ans = 1;
        for(int col = 1;col<row;col++)
        {
            ans = ans * (row - col);
            ans = ans/col;
            rowMatrix.add(ans);
        }
        return rowMatrix;

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> matrix = new ArrayList<>();
        for(int row = 1;row<=numRows;row++)
        {
            List rowAns = generateCol(row);
            matrix.add(rowAns);
        }
     return matrix;
    }
}
//brute force
     // List<List<Integer>> matrix = new ArrayList<>();
        
        // for(int i = 0;i<numRows;i++)
        // {
        //     List<Integer> arr = new ArrayList<>();
        //     for(int j = 0;j<=i;j++)
        //     {
        //         if(i == j)
        //         {
        //             arr.add(1);
        //         }
        //         else if(j == 0 && i != 0)
        //         {
        //             arr.add(1);
        //         }
        //         else{
        //             arr.add((matrix.get(i-1)).get(j-1) + (matrix.get(i-1)).get(j));
        //         }
                
        //     }
        //     matrix.add(new ArrayList<>(arr));
        // }
        // return matrix;