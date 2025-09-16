class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nse = nextSmallest(heights);
        int[] pse = prevSmallest(heights);
        int total = 0;
        int n = heights.length;
        for(int i = 0;i<n;i++)
        {
            int area = heights[i] * ( nse[i] - pse[i] - 1);
            total = Math.max(total,area);
        }
        return total;

    }
    public static int[] nextSmallest(int[] arr)
    {
        int n = arr.length;
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                nse[i] = st.peek();
                
            }
            else{
                nse[i] = n;
            }
            st.push(i);
        }
        return nse;
    }
    public static int[] prevSmallest(int[] arr)
    {
        int n = arr.length;
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                pse[i] = st.peek();
                
            }
            else{
                pse[i] = -1;
            }
            st.push(i);
        }
        return pse;
    }
}