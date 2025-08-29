class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0;
        int count = 1;
        for(int r = 0;r<nums.length;r++)
        {
            if(nums[l] != nums[r])
            {
                l++;
                count++;
                nums[l] = nums[r];
            }
             
        }
        return count;
    }
}
 // int i = 0;
        // for(int j = 1;j<nums.length;j++)
        // {
        //     if(nums[j] != nums[i])
        //     {
        //         i++;
        //         nums[i]  = nums[j];
        //     }

        // }
        // return i+1;     