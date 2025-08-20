class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return func(nums,goal) - func(nums,goal-1);
    }

    private int func(int[] nums, int goal)
    {
        int sum = 0;
        int l = 0;
        int count = 0;
        if(goal<0) return 0;
        if(nums.length <= 0) return 0;
        for(int r = 0;r<nums.length;r++)
        {
            
            sum += nums[r];
            while(sum>goal ) // goal < 0 omit
            {
                sum = sum - nums[l];
                l++;
            }
            if(sum <= goal)
            {
                count = count + (r-l+1);
            }
        }
        return count;

    }
}








//int count = 0;
        // for(int l = 0; l < nums.length ; l++)
        // {
        //     int add = 0;
        //     for(int r = l ; r < nums.length ; r++)
        //     {
        //         if(add > goal)
        //         {
        //             break;
        //         }
        //         add = add + nums[r];
        //         if(add == goal) count++;
        //     }
            
            
        // }
        // return count;