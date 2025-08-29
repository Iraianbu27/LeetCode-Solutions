class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expect = (n * (n + 1))/2;
        int add = 0;
        for(int i: nums)
        {
            add += i;
        }
        return expect - add;















        // int i = 0;
        // int count = 0;
        // Arrays.sort(nums);
        // for(int j = i+1 ; j<nums.length ; j++)
        // {
        //     if((nums[j] - nums[i]) > 1)
        //     {
        //         return nums[j]-1;
        //     }
        //     i++;
        // }
        // if(nums[0] ==0){
        //     return nums[nums.length-1]+1 ;
        // }
        // return 0;
    }
}
// int n = nums.length;
        // int expect = (n * (n + 1))/2;
        // int sum = 0;
        // for(int i : nums)
        // {
        //     sum+= i;
        // }
        // return expect - sum;