import java.util.*;
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return (func(nums,k) - func(nums,k-1));

    }

    public int func(int[] nums,int k)
    {
        // if(k == 0) return 0;
        int count = 0;
      Map<Integer,Integer> mpp = new HashMap<>();
      int l = 0;
      for(int r = 0;r<nums.length;r++)
      {
        mpp.put(nums[r],mpp.getOrDefault(nums[r] ,0)+1);
        while(mpp.size() > k)
        {
           mpp.put(nums[l],mpp.get(nums[l]) -1);
           if(mpp.get(nums[l]) == 0)
           {
            mpp.remove(nums[l]);
           }
           l++;

            
        }
        count += r-l+1;

      }
      
     return count;
    }
    
}


// BRUTE FORCE APPROACH -time limit exceeded

//  int count = 0;
//         for(int l = 0;l<nums.length;l++){
//             Map<Integer,Integer> map = new HashMap<>();
//             int distinct =0;
//             for(int r = l;r<nums.length;r++)
//             {
//                 if(!(map.containsKey(nums[r]))){
//                     distinct++;
//                 }
//                 map.put(nums[r],r);
//                 if(distinct == k)
//                 {
//                     count++;
//                 }
//                 else if(distinct > k){
//                     break;
//                 }
//             }
//         }
//         return count;