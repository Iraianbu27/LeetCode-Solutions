class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0,right=0;
        while(right < nums.length)
        {
            if(nums[right] != 0)
            {
                int thVar = nums[left];
                nums[left] = nums[right];
                nums[right] = thVar;
                left++;
            }
            right++;
        }
        // int n =nums.length;
        // int j = 0;
        // for(int i = 0;i<n;i++)
        // {
        //     if(nums[i] != 0)
        //     {
        //         nums[j++] = nums[i];
        //         // j++;
        //     }

        // }
        // while(j< nums.length)
        // {
        //     nums[j++] = 0;
        //     // j++;
        // }


    }
}
























        // int i = 0,j=i+1;
        // for(int k = 0;k<=nums.length-2;k++)
        // {
        //     if(nums[i] == 0)
        //     {
        //         if(nums[i] != nums[j])
        //         {
        //             int thVar = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = thVar;
        //             i++;
        //             j++;
        //         }
        //         else{
        //             j++;
        //         }
        //     }
        //     else{
        //         i++;
        //         j++;
        //     }

        // }
        
