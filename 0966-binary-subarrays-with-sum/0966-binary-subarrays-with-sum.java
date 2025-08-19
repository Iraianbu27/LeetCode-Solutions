class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        for(int l = 0; l < nums.length ; l++)
        {
            int add = 0;
            for(int r = l ; r < nums.length ; r++)
            {
                if(add > goal)
                {
                    break;
                }
                add = add + nums[r];
                if(add == goal) count++;
            }
            
            
        }
        return count;
    }
}