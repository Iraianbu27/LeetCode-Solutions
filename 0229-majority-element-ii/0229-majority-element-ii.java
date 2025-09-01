import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        long n = nums.length;
        long time = (n/3);
        Map<Integer,Integer> mpp = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
        {
            mpp.put(nums[i] , mpp.getOrDefault(nums[i],0) + 1);
        }
        for(int i : mpp.keySet())
        {
            if(mpp.get(i) > time)
            {
                list.add(i);
            }
        }
        return list;
    }
}