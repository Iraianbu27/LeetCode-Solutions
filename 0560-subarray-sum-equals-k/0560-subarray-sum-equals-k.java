import java.util.*;
class Solution {
    //x is prefix x-k ,k
    public int subarraySum(int[] nums, int k) {
        int prefix =0;
        int subArr = 0; 
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0, 1);

        for(int i = 0;i<nums.length;i++)
        {
            //1.add prefix
            //2.use formula x-k,k
            //3.push to ds
            
            prefix += nums[i];
 
            int isPre = prefix - k;
            if(mpp.containsKey(isPre))
            {
                subArr += mpp.get(isPre);
            }
          
            
            mpp.put(prefix,mpp.getOrDefault(prefix,0) + 1);

        }
        return subArr;


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