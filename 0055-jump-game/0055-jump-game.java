class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxJump = nums[0];
        for(int i = 0;i<n;i++)
        {
            if(i > maxJump){
                return false;  
            }
            maxJump = Math.max(maxJump,i+nums[i]);

        }
        return true;
 
    }
}
       // while(i < n){
        //     if(i == n-1){
        //         break;
        //     }
        //     else if(nums[i] == 0){
        //         for(int j = i;j>= nums[i])
        //     }
        //     else{
        //         i += nums[i];
        //     }
        // }
        // return i>=n-1;