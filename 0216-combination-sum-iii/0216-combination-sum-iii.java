class Solution {

    public static void recCombination(List<Integer> list,List<List<Integer>> subList,int index,int[] arr,int target,int k)
    {
        if(index == arr.length)
        {
            if(target == 0)
            {
               if(list.size() == k){
                 subList.add(new ArrayList<>(list));
               }
            }
            return;
        }
        list.add(arr[index]);
        recCombination(list,subList,index + 1,arr,target - arr[index],k); // take it
        list.remove(list.size() - 1);
        recCombination(list,subList,index + 1,arr,target,k); //dont pick

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> subList = new ArrayList<>();
        recCombination(list,subList,0,arr,n,k);
        return subList;        
    }
}