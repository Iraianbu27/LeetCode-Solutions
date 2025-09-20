import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int n = nums.length;
     
       List<List<Integer>> list = new ArrayList<>();
       Arrays.sort(nums);
      for(int i = 0;i<=n-3;i++)
      {
        if(i > 0 && nums[i] == nums[i-1]) continue; // to avoid duplicates
        int j = i+1;
        int k = n-1;
        while( j<k)
        {
            if((nums[i] + nums[j] + nums[k]) < 0){
                j++;
            }
            else if((nums[i] + nums[j] + nums[k]) > 0)
            {
                k--;
            }
            else{
                list.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]))) ;
                // list.add(new ArrayList<>(newList));
                j++;
                k--;
                while(j<k && nums[j] == nums[j-1]) //to  avoid duplicates
                {
                    j++;
                }
                while(k>j && nums[k] == nums[k+1]) // to avoid duplicates
                {
                    k--;
                }
            }
        }
    }
    return list;
    }
}
//HASHMAP APPROACH 
//  int n = nums.length;
//          Set <List<Integer>> ansSet = new HashSet<>();
//          List<List<Integer>> newList = new ArrayList<>();

//         for(int i = 0;i<n;i++)
//         {
//             Set<Integer> set = new HashSet<>();
//             // List<Integer> list = new ArrayList<>();
//             for(int j = i+1;j<nums.length;j++)
//             {
//                 int k = (-(nums[i] + nums[j]));
//                 if(set.contains(k)){
//                     List<Integer> list = Arrays.asList(nums[i], nums[j], k);
//                     Collections.sort(list);
//                     ansSet.add(list);
//                 }
//                 set.add(nums[j]);
//             }
            
//         }
//         for(List i : ansSet)
//         {
//             newList.add(i);
//         }
       
//         return newList;