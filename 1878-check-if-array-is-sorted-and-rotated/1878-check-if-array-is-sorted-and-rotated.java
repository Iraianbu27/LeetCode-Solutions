class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0;i<=n-2;i++)
        {
            if(nums[i] > nums[i+1])
            {
                count++;
            }
        }
        if(nums[n-1] > nums[0])
        {
            count++;
        }
        if(count<=1)
        {
            return true;
        }
        return false;
       
        
        // for(int i =0;i<=n-2;i++)
        // {
        //     if(nums[i] > nums[i+1])
        //     {
        //         count++;
        //     }
            
        // }
        // if(nums[n-1] >  nums[0])
        // {
        //     count++;
        // }
        
        // if(count <= 1)
        // {
        //     return true;
        // }
        // else{
        //     return false;
        // }
        
    }
}
 // for (int i=0;i<n;i++)
        // {
        //     if((i>0) && (nums[i] == nums[i-1]))
        //     {
        //         continue;
        //     }
        //     if( (i>0) && ( nums[i] - nums[i-1]  != 1))
        //     {
        //         count++;
        //     }
        // }
        // if(count == 1)
        // {
        //     return true;
        // }
        // return false;