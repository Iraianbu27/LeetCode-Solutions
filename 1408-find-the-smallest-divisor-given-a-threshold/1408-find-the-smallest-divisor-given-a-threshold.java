import java.util.*;
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxEle = 0;
        for(int i: nums)
        {
            maxEle = Math.max(maxEle,i);
        }
        int low = 1,high = maxEle,mid = 0;
        int output=Integer.MAX_VALUE;
        while(low <= high)
        {
            mid = (high+low)/2;
            int div=0;
            for(int i =0;i<nums.length;i++)
            {
                div = div+  ((nums[i] + mid - 1)/mid);
            }

            if(div <= threshold)
            {
                output = Math.min(output,mid);
                high = mid -  1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return output;
        
    }
}