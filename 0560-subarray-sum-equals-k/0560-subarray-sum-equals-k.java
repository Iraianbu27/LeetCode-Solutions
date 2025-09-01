import java.util.*;
class Solution {
    //x is prefix x-k ,k
     public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // Empty prefix with count 1
        
        int prefix = 0;
        int result = 0;
        
        for(int num : nums) {
            prefix += num;
            
            int target = prefix - k;
            
            // Add ALL occurrences of target prefix
            if(prefixCount.containsKey(target)) {
                result += prefixCount.get(target);
            }
            
            // Update count of current prefix
            prefixCount.put(prefix, prefixCount.getOrDefault(prefix, 0) + 1);
        }
        
        return result;
    }
}
//BRUTE FORCE O(N^2)
    //   int subArr = 0;
    //   for(int i = 0;i<nums.length;i++)
    //   {
    //     int count = 0;
    //     for(int j = i;j<nums.length;j++)
    //     {
    //         count += nums[j];
    //         if(count == k)
    //         {
    //             subArr++;
    //             // break;
    //         }
    //     }
    //   }
    //   return subArr;