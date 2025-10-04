import java.util.*;
class Solution {
    public static void  recSolution(List<Integer> list, List<List<Integer>> subList,int[] arr,int target ,int i)
    {
        // if(i == arr.length)
        // {
            if(target == 0)
            {
                subList.add(new ArrayList<>(list)); 
                return ;      
            }       
                 
        // }
        for(int k = i ;k<arr.length;k++)
        {
            if(k>i && arr[k] == arr[k-1] ) continue;
            if(arr[k] > target) break;
            
            list.add(arr[k]);
            recSolution(list,subList,arr,target - arr[k]  ,k + 1);
            list.remove(list.size() - 1);
            
        }   
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> subList = new ArrayList<>();
        Arrays.sort(candidates);
        recSolution(list,subList,candidates,target ,0);
        return subList;
    }
}























// USING SET METHOD

// import java.util.*;
// class Solution {
//     public static void  recSolution(List<Integer> list, Set<List<Integer>> subList,int[] arr,int target ,int i)
//     {
//         //baseCondition
//         // if(target < arr[i])
//         // {
//         //     return ;
//         // }
//         if(i == arr.length)
//         {
//             if(target == 0)
//             {
//                 subList.add(new ArrayList<>(list));
//                 // return ;
//             }       
//             return ;       
//         }

//         if(arr[i] <= target) 
//         {
//         list.add(arr[i]);
//         // target = target - arr[i];
    
//         recSolution(list,subList,arr,target - arr[i]  ,i +1);
//         list.remove(list.size() - 1);
//         // target += arr[i];
//         }

//         recSolution(list,subList,arr,target,i + 1);
//     }
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         List<Integer> list = new ArrayList<>();
//         Set<List<Integer>> subList = new LinkedHashSet<>();
//         Arrays.sort(candidates);
//         recSolution(list,subList,candidates,target ,0);
//         List<List<Integer>> finalList = new ArrayList<>(subList);

//         return finalList;
//     }
// }