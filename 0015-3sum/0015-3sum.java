import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
         Set <List<Integer>> ansSet = new HashSet<>();
         List<List<Integer>> newList = new ArrayList<>();

        for(int i = 0;i<n;i++)
        {
            Set<Integer> set = new HashSet<>();
            // List<Integer> list = new ArrayList<>();
            for(int j = i+1;j<nums.length;j++)
            {
                int k = (-(nums[i] + nums[j]));
                if(set.contains(k)){
                    List<Integer> list = Arrays.asList(nums[i], nums[j], k);
                    Collections.sort(list);
                    ansSet.add(list);
                }
                set.add(nums[j]);
            }
            
        }
        for(List i : ansSet)
        {
            newList.add(i);
        }
       
        return newList;
    }
}