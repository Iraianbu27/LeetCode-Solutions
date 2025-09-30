class Solution {
    public int recFunc(int[] nums,int n){
        
        if(n == 1){
        return nums[0];
        }
        int[] newNums = new int[n-1];
        for(int i = 0;i<newNums.length;i++){
            newNums[i] = (nums[i] + nums[i+1]) % 10;
        }
        return recFunc(newNums,newNums.length);

    }

    public int triangularSum(int[] nums) {
        return recFunc(nums ,nums.length);
    }

}