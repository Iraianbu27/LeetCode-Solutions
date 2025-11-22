class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] curr = new int[n];
        int[] hash = new int[n];
        Arrays.fill(curr,1);
        int maxi=0;
        int lastIndex = 0;
        for(int index = 0;index<n;index++){
            hash[index] = index;
            for(int prev = 0;prev<index;prev++){
                if(nums[index]%nums[prev] == 0){
                    if(1+curr[prev] > curr[index]){
                        curr[index] = 1+curr[prev];
                        hash[index] = prev;
                    }
                }
            }
            if(curr[index] > maxi){
                maxi = curr[index];
                lastIndex = index;
            }
        }
           List<Integer> list = new ArrayList<>();
            int hashIndex = lastIndex;
            while(hashIndex != hash[hashIndex]){
                list.add(0,nums[hashIndex]);
                hashIndex = hash[hashIndex];
            }
            list.add(0,nums[hashIndex]);
            return list;
    }
 
}
////recurssion
// class Solution {
//     public List<Integer> recFunction(int[] nums,int index,int prev,List<Integer> temp){
//         if(index == nums.length){
//             return new ArrayList<>(temp);  
//         }
//         List<Integer> pick = new ArrayList<>();
//         if(prev == -1 || nums[index]%nums[prev] == 0){
//             temp.add(nums[index]);
//             pick = recFunction(nums,index+1,index,temp);
//             temp.remove(temp.size()-1);
//         }
//         List<Integer> notPick = recFunction(nums,index+1,prev,temp);
//         return (pick.size() > notPick.size()) ? pick : notPick;
//     }
//     public List<Integer> largestDivisibleSubset(int[] nums) {
//         List<Integer> temp = new ArrayList<>();
//         Arrays.sort(nums);
//         return recFunction(nums,0,-1,temp);
//     }
// }