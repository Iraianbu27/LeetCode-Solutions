class Solution {
    public long subArrayRanges(int[] nums) {
       int[] pge = previousGE(nums);
       int[] nge = nextGE(nums);
       int[] pse = previousSE(nums);
       int[] nse = nextSE(nums);
       long smallEle = 0;
       long largeEle = 0;
       for(int i = 0;i<nums.length;i++)
       {
        int ngeL = nge[i] - i; // next greater
        int pgeL = i - pge[i]; // previous greater
        int nseL = nse[i] - i; // next smaller
        int pseL = i - pse[i]; // previous smaller
        smallEle += ((long) nseL * pseL * nums[i]);
        largeEle += ((long) ngeL * pgeL * nums[i]);
       }
       return largeEle - smallEle;
    }
    public static int[] previousGE(int[] arr){
        int n = arr.length;
        Stack<Integer> st= new Stack<>();
        int[] pge = new int[n]; //
        for(int i = 0;i<n;i++) //
        {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) //
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                pge[i] = st.peek(); //
            }
            else{
                pge[i] = -1; //
            }
            st.push(i);
        }
        return pge; //
    }
    public static int[] nextGE(int[] arr){
        int n = arr.length;
        Stack<Integer> st= new Stack<>();
        int[] nge = new int[n]; 
        for(int i = n-1;i>=0;i--) 
        {
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) 
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                nge[i] = st.peek(); 
            }
            else{
                nge[i] = n; 
            }
            st.push(i);
        }
        return nge; 
    }
     public static int[] previousSE(int[] arr){
        int n = arr.length;
        Stack<Integer> st= new Stack<>();
        int[] pse = new int[n]; //
        for(int i = 0;i<n;i++) //
        {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) //
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                pse[i] = st.peek(); //
            }
            else{
                pse[i] = -1; //
            }
            st.push(i);
        }
        return pse; //
    }
     public static int[] nextSE(int[] arr){
        int n = arr.length;
        Stack<Integer> st= new Stack<>();
        int[] nse = new int[n]; //
        for(int i = n-1;i>=0;i--) //
        {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) //
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                nse[i] = st.peek(); //
            }
            else{
                nse[i] = n; //
            }
            st.push(i);
        }
        return nse; //
    }
}
































 // int n = nums.length;
        // long total = 0;
        // for(int i = 0;i<n;i++)
        // {
        //     long sum = 0;
        //     int maxValue = Integer.MIN_VALUE;
        //     int minValue = Integer.MAX_VALUE;
        //     for(int j = i;j<n;j++)
        //     {
        //         maxValue = Math.max(maxValue,nums[j]);
        //         minValue = Math.min(minValue,nums[j]);
        //         sum = sum + ((long)maxValue - (long)minValue);
        //     }
        //     total += sum;

        // }
        // return total;