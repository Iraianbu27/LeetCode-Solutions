class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
       return  fun(arr,k) - fun(arr,k-1);
    }
    private int fun(int[] arr, int k)
    {
        int odd=0,l=0,count=0;
        for(int r = 0;r<arr.length;r++)
        {
            if(arr[r]%2 != 0)
            {
                odd++;
            }
            while(odd > k)
            {
                if(arr[l] % 2 != 0)
                {
                    odd--;
                }
                l++;
            }
         count = count + (r-l+1);
        }
        return count;
    }
}