import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        {
            return 0;
        }
       Set<Integer> set = new HashSet<>();
       for(int i : nums)
       {
        set.add(i);
       }
       int maxLength = 0;
       
    //    int currNum = 0;
        for(int i : set)
        {
            int count = 0;
            if(!(set.contains(i-1)))
            {
                count++;
                int currNum = i;
                while(set.contains(currNum+1))
                {
                    count++;
                    currNum = currNum + 1;
                }
                maxLength = Math.max(maxLength, count);
            }
        }
        return maxLength;
       
   
        
    }
}
 //    its O(N log N) N for looping log N due to sorting array
        // Arrays.sort(nums);
        // int count=1;
        // int maxCount = 0;
        // if(nums.length <= 0)
        // {
        //     return 0;
        // }

        // for(int i = 0;i<nums.length-1;i++)
        // {
        //     if(nums[i+1] == nums[i]) continue;
        //     if((nums[i+1] - nums[i]) != 1)
        //     {
        //         maxCount = Math.max(maxCount,count);
        //         count = 1;
        //     }
            
        //     else{
        //         count++;
        //     }
        // }
        // maxCount = Math.max(maxCount,count);
        // return maxCount;