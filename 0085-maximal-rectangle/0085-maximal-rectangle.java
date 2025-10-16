class Solution {
    public static int LargestRectHistogram(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int total = 0;
        for(int i = 0;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
            {
                int ele = st.pop();
                int area= (arr[ele] * (i  - (st.isEmpty() ? -1 : st.peek()) - 1 ));
                total = Math.max(area,total);
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            int ele = st.pop();
            int area= (arr[ele] * (n  - (st.isEmpty() ? -1 : st.peek()) - 1 ));
            total = Math.max(area,total);
        }
        return total;
    }

    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] prefixSum = new int[matrix.length][matrix[0].length];
        // PREFIX SUM APPROACH TO FIND THE HEIGHT
        // int col = 0;
        // while(col<m)
        // {
        //     int prSum = 0;
        //     for(int i = 0;i<n;i++)
        //     {
        //         int val =  matrix[i][col] - '0';
        //         if(val == 0)
        //         {
        //             prSum = 0;
        //         }
        //         else{
        //             prSum += val;
        //         }
        //         prefixSum[i][col] = prSum;
        //     }
        //     col++;
        // }

        //USING STANDARD ROW BY ROW METHOD
        for(int row = 0;row<n;row++){
            for(int col  = 0;col <m;col++){
                if(row == 0 ) {
                    prefixSum[row][col] = matrix[row][col]-'0';
                }
                else{
                    if(matrix[row][col] == '0') prefixSum[row][col] = 0;
                    else prefixSum[row][col] = matrix[row][col] - '0' + prefixSum[row-1][col];
                }
            }
        }
        int area = 0;
        for(int i = 0;i<n;i++)
        {
              area = Math.max(area,LargestRectHistogram(prefixSum[i]));
        }
        return area;
    }
}