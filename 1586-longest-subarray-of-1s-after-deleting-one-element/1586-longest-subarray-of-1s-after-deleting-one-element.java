class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0,r=0,del = 0;
        int count = 0;
        // int output = 0;
        while(r<nums.length)
        {
            if(nums[r] == 0)
            {
                del++;
            }
            while(del > 1)
            {
                if(nums[l] == 0)
                {
                    del--;
                }
                l++;
            }
            count = Math.max(count,r-l);

            r++;
        }
        return count;
    }
}

            // if(nums[0] == 0)
            // {
            //     l++;
            //     // r++;
            // }
            // if(nums[r] != 1 && del == 1)
            // {
                 
            //     del--;
            // }
            // else if(nums[r] != 1 && del == 0)
            // {
            //     while(del < 1)
            //     {
            //         if(nums[l] == 0)
            //         {
            //             del++;
            //         }
            //         l++;
            //     }
            // }
            // if(nums[r] != 0)
            // {
            //     count++;
            // }
            // else{
            //     count = 0;
            // }
            // output = Math.max(output,count);