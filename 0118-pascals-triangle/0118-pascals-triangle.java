import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> matrix = new ArrayList<>();
        
        for(int i = 0;i<numRows;i++)
        {
            List<Integer> arr = new ArrayList<>();
            for(int j = 0;j<=i;j++)
            {
                if(i == j)
                {
                    arr.add(1);
                }
                else if(j == 0 && i != 0)
                {
                    arr.add(1);
                }
                else{
                    arr.add((matrix.get(i-1)).get(j-1) + (matrix.get(i-1)).get(j));
                }
                
            }
            matrix.add(new ArrayList<>(arr));
        }
        return matrix;
    }
}