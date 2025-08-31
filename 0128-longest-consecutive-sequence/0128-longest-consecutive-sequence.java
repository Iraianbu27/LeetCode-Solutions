import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int maxCount = 0;
        if(nums.length <= 0)
        {
            return 0;
        }
        if(nums.length == 1) {
            if(String.valueOf(nums[0]).trim().equals("")){
                return 0;
            }
            else{
                return 1;
            }
        }
        for(int i = 0;i<nums.length-1;i++)
        {
            if(nums[i+1] == nums[i]) continue;
            if((nums[i+1] - nums[i]) != 1)
            {
                maxCount = Math.max(maxCount,count);
                count = 1;
            }
            
            else{
                count++;
            }
        }
        maxCount = Math.max(maxCount,count);
        return maxCount;
        
    }
}