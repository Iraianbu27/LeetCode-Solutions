import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i:nums)
        {
            res = res ^ i;
        }
        return res;
        // Map<Integer,Integer> map = new HashMap<>();
        // if(nums.length == 1)
        // {
        //     return nums[0];
        // }
        // for(int i : nums)
        // {
        //     if(map.containsKey(i))
        //     {
        //         map.put(i,map.get(i) + 1);
        //     }
        //     else{
        //         map.put(i,1);
        //     }
        // }
        // for(int key : map.keySet())
        // {
        //     if((map.get(key)) == 1)
        //     {
        //         return key;
        //     }
        // }
        // return 0;
    }
}