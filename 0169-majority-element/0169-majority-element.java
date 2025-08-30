import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mpp = new TreeMap<>();
        for(int i: nums)
        {
            mpp.put(i,mpp.getOrDefault(i,1)+1);
        }
        int max = 0;
        int key = 0;
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet())
        {
            if(max < entry.getValue())
            {
                max = entry.getValue();
                key = entry.getKey();
            }

        }
        return key;
    }
}