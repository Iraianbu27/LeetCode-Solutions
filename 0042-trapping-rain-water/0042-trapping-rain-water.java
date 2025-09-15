class Solution {
    public static int[] leftMax(int[] arr)
    {
        int[] lt = new int[arr.length];
        lt[0] = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            lt[i] = Math.max(lt[i-1],arr[i]);
        }
        return lt;
    }
    public static int[] rightMax(int[] arr)
    {
        int n = arr.length;
        int[] rg = new int[arr.length];
        rg[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--)
        {
            rg[i] = Math.max(rg[i+1],arr[i]);
        }
        return rg;
    }
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;
        int[] lt = new int[n];
        int[] rg = new int[n];
        lt = leftMax(height);
        rg = rightMax(height);

        for(int i = 0;i<n;i++)
        {
            if(height[i] < lt[i] && height[i] < rg[i])
            {
                total += Math.min(lt[i],rg[i]) - height[i];
            }
        }
        return total;
    }
}