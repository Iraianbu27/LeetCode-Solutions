import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
       int count = 0;
       int el = 0;
       for(int i = 0;i<nums.length;i++)
       {
        if(count == 0)
        {
            el = nums[i];
            count++;
        }
        else if(nums[i] == el)
        {
            count++;
        }
        else  
        {
            count--;
        }
       }
       int finalCount = 0;
       for(int i = 0;i<nums.length;i++)
       {
        if(nums[i] == el) finalCount++;
       }
       if(finalCount > (nums.length/2)) return el;
       return 0;
    }
}
 // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n/2];

        //approach 2
        //Hash map method
        // Map<Integer,Integer> mpp = new TreeMap<>();
        // for(int i: nums)
        // {
        //     mpp.put(i,mpp.getOrDefault(i,0)+1);
        // }
        // int max = 0;
        // int key = 0;
        // for(Map.Entry<Integer,Integer> entry : mpp.entrySet())
        // {
        //     if(max < entry.getValue())
        //     {
        //         max = entry.getValue();
        //         key = entry.getKey();
        //     }

        // }
        // return key;