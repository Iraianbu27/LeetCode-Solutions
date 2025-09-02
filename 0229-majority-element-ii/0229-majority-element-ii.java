import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int n = nums.length;
       int ele1 = 0,ele2 = 0,count1 = 0,count2 = 0;
       for(int i = 0;i<n;i++)
       {
        if(count1 == 0 && nums[i] != ele2)
        {
            count1++;
            ele1 = nums[i];
        }
        else if(count2 == 0 && nums[i] != ele1)
        {
            count2++;
            ele2 = nums[i];
        }
        else if(ele1 == nums[i] ) count1++;
        else if(ele2 == nums[i] ) count2++;
        else{
            count1--;
            count2--;
        }
       }
       int fiCount1 = 0;
       int fiCount2 = 0;
       for(int i = 0 ;i<n;i++)
       {
        if(nums[i] == ele1) fiCount1++;
        else if(nums[i] == ele2) fiCount2++; 
       }
       int threshold = n/3;
       List<Integer> list = new ArrayList<>();
       if(fiCount1 > threshold ) {
        list.add(ele1);
      
       }
       if(fiCount2 > threshold)
       {
        list.add(ele2);
       }
    
        return list;
    }
}
 // long n = nums.length;
        // long time = (n/3);
        // Map<Integer,Integer> mpp = new HashMap<>();
        // List<Integer> list = new ArrayList<>();
        // for(int i = 0;i<nums.length;i++)
        // {
        //     mpp.put(nums[i] , mpp.getOrDefault(nums[i],0) + 1);
        // }
        // for(int i : mpp.keySet())
        // {
        //     if(mpp.get(i) > time)
        //     {
        //         list.add(i);
        //     }
        // }
        // return list;