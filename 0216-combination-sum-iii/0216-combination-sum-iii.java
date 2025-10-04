class Solution {

    public static void recCombination(int[] arr,List<List<Integer>> list,List<Integer> subList,int i,int k,int n)
    {
        // if(index == arr.length)
        // {
        //     if(target == 0)
        //     {
        //        if(list.size() == k){
        //          subList.add(new ArrayList<>(list));
        //        }
        //     }
        //     return;
        // }
        // list.add(arr[index]);
        // recCombination(list,subList,index + 1,arr,target - arr[index],k); // take it
        // list.remove(list.size() - 1);
        // recCombination(list,subList,index + 1,arr,target,k); //dont pick
         if(i >= arr.length){
            if(k == 0){
                if(subList.size() == n){
                    list.add(new ArrayList<>(subList));
                   
                }
            }
            return;
        }
        if(k-arr[i] >= 0){
            subList.add(arr[i]);
            recCombination(arr,list,subList,i+1,k-arr[i],n);
            subList.remove(subList.size() -1);
        }
        recCombination(arr,list,subList,i+1,k,n);


    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<Integer> subList  = new ArrayList<>();
        List<List<Integer>> list  = new ArrayList<>();
        recCombination(arr,list,subList,0,n,k);
        return list;        
    }
}


// {

//     public void recFunction(int[] arr,List<List<Integer>> list,List<Integer> subList,int i,int k,int n){
//         if(i >= arr.length){
//             if(k == 0){
//                 if(subList.size() == n){
//                     list.add(new ArrayList<>(subList));
                   
//                 }
//             }
//             return;
//         }
//         if(k-arr[i] >= 0){
//             subList.add(arr[i]);
//             recFunction(arr,list,subList,i+1,k-arr[i],n);
//             subList.remove(subList.size() -1);
//         }
//         recFunction(arr,list,subList,i+1,k,n);

//     }



//     public List<List<Integer>> combinationSum3(int k, int n) {
//         int[] arr = {1,2,3,4,5,6,7,8,9};
//         List<List<Integer>> list = new ArrayList<>();
//         List<Integer> subList = new ArrayList<>();
//         recFunction(arr,list,subList,0,k,n);
//     }
// }





















































