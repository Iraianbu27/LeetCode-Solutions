
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix[0].length; // col length
        int m = matrix.length; // row length
        int top = 0;
        int right = n-1; //end of col
        int bottom = m-1; // end of row
        int left = 0;
        // right -> bottom -> left -> top
        //right
        while(top <= bottom && left <= right)
        {
            for(int i = left;i<=right;i++)
            {
                list.add(matrix[top][i]);
            }
            top++;

            //down
            for(int i = top;i<=bottom;i++)
            {
                list.add(matrix[i][right]);
            }
            right--;
           
         
           if(top<=bottom)
           {
                  //left
                for(int i = right;i>=left;i--)
                {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
           }
           if(left <= right){
                        //top
                for(int i = bottom;i>=top;i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
           }
        }

           
          
        
            return list;
    }
}