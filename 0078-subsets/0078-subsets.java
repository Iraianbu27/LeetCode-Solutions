import java.util.*;
class Solution {
    public static void sets(List<Integer> list,List<List<Integer>> subset ,int[] nums,int i)
    {
        if(i == nums.length)
        {
            subset.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        sets(list,subset,nums,i + 1); //take it
        list.remove(Integer.valueOf(nums[i]));
        sets(list,subset,nums,i + 1); //dont take it

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> subset = new ArrayList<>();
        sets(list,subset,nums,0);
        return subset;

        // int length = nums.length;
        // List<List<Integer>>list = new ArrayList<>();
        // for(int j = 0;j<(1<<length);j++)
        // {
        //     List<Integer>subset = new ArrayList<>();
        //     for(int i = 0;i<length;i++)
        //     {
        //         if((j & (1<<i)) != 0 ){
        //             subset.add(nums[i]);
                    
        //         }
        //     }
        //     list.add(subset);
            
        // }
        // return list;
        
    }
}