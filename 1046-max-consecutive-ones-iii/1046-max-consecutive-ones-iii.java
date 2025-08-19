class Solution {
    public int longestOnes(int[] arr, int k) {
        int z = 0;
        int l = 0,r;
        int max = 0;
        for(r =0;r < arr.length ; r++)
        {
           if(arr[r] == 0)
           {
            z++;
           }
             while(z>k)
                {
                   if(arr[l] == 0){
                    z--;
                    
                   }
                   l++;
                }
             
           
           max = Math.max(max,r-l+1);
        }
         return max;
    }
}