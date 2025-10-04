import java.util.*;
class Solution {
    public static void  recSolution(List<Integer> list, List<List<Integer>> subList,int[] arr,int target ,int i)
    {
        //baseCondition
        if(target == 0){
            subList.add(new ArrayList<>(list));
            return;
        }
        if(i >= arr.length){
            return;
        }

        if(target - arr[i] >= 0) 
        {
        list.add(arr[i]);
        // target = target - arr[i];
    
        recSolution(list,subList,arr,target - arr[i]  ,i);
        list.remove(list.size() - 1);
        // target += arr[i];
        }

        recSolution(list,subList,arr,target,i + 1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> subList = new ArrayList<>();
        recSolution(list,subList,candidates,target ,0);
        return subList;
    }
}