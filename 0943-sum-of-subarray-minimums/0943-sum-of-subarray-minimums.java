class Solution {
    public static int[] nsee(int[] arr)
    {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i] <= arr[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i] = st.peek();
            }
            else{
                ans[i] = n;
            }
            st.push(i);
        }
        return ans;
    }
    public static int[] pse(int[] arr)
    {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[i] < arr[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                ans[i] = st.peek();
                 
            }
            else{
                ans[i] = -1;
                
            }
            st.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        int[] nextArr = nsee(arr);
        int[] prevArr = pse(arr);
        long total = 0;
        long finalOp = 0;
        int mod = (int)1e9+7;
        for(int i = 0;i<arr.length;i++)
        {
            int left = i - prevArr[i];
            int right = nextArr[i] - i;
            total = ( (long)left*right*arr[i])%mod;
            finalOp  = (finalOp + total)%mod;


        }
        return (int)finalOp;
    }
}