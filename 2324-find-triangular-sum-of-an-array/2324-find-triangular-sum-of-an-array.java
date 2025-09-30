class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        for(int size = n;size>1;size--){
            for(int i = 0;i<size - 1;i++){ // we comppar i and i + 1 so size - 1
                nums[i] = (nums[i] + nums[i+1]) % 10;
            } 
        }
        return nums[0];
    }

}
// recursive approach
// public int recFunc(int[] nums,int n){
        
    //     if(n == 1){
    //     return nums[0];
    //     }
    //     int[] newNums = new int[n-1];
    //     for(int i = 0;i<newNums.length;i++){
    //         newNums[i] = (nums[i] + nums[i+1]) % 10;
    //     }
    //     return recFunc(newNums,newNums.length);

    // }

    // public int triangularSum(int[] nums) {
    //     return recFunc(nums ,nums.length);
    // }