 
        
        import java.util.*;
class Solution {
    public static void sets(List<Integer> list,List<List<Integer>> subset ,int[] nums,int i)
    {
        subset.add(new ArrayList<>(list));
        for(int j = i;j<nums.length;j++){
            if(j>i && (nums[j] == nums[j-1])){
                continue;
            }
            list.add(nums[j]);
            
            sets(list,subset,nums,j + 1); //take it
            list.remove(list.size() - 1);
            // sets(list,subset,nums,i + 1); //dont take it
        }


    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> subset = new ArrayList<>();
        Arrays.sort(nums);
        sets(list,subset,nums,0);
        return subset;
    }
}