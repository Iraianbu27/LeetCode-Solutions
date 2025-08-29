class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int  l = 0,r=0;
       int count = 0;
       int n = nums.length;
       while(r < n)
       {
        if(nums[r] == 0)
        {
            l=r+1;
            r++;
            continue;
        }
        count = Math.max(count,r-l+1);
        r++;
       }
       return count;
    }
}
 // int maxOne = 0;
        // int count = 0;
        // for(int i : nums)
        // {
        //     if(i == 1)
        //     {
        //         count++;
        //     }
        //     else{
        //         if(count > maxOne){
        //              maxOne = count;
        //         }
               
        //         count = 0;
        //     }
        // }
        // if(count > maxOne)
        // {
        //      maxOne = count;
        // }
        // // maxOne = count;
        // return maxOne;