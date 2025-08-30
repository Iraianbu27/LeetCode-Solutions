class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++)
        {
            sum += nums[i];
            max = Math.max(max,sum);
            if(sum<0)
            {
                sum = 0;
            }
        }
        return max;      
    }
}

//>BRUTE FORE AND < OPTIMAL IS DOWN;
  //BETTER APPROACH 
        // int maxCount = nums[0];
        // for(int i = 0;i<nums.length;i++)
        // {
        //     int count = 0;
        //     for (int j = i;j<nums.length;j++)
        //     {
        //         count += nums[j];
        //         maxCount = Math.max(maxCount,count);
        //     }
            

        // }
        // return maxCount;