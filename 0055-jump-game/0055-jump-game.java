// class Solution {
//     public boolean canJump(int[] nums) {
//         int n = nums.length;
//         int maxJump = nums[0];
//         for(int i = 0;i<n;i++)
//         {
//             if(i > maxJump){
//                 return false;  
//             }
            
//             maxJump = Math.max(maxJump,i+nums[i]);
//             if(maxJump >= n-1) break;

//         }
//         return true;
 
//     }
// }
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

class Solution {
    public boolean canJump(int[] nums) {
        int maxReach= nums[0];
        for(int i = 0;i<nums.length;i++)
        {
            if(i>maxReach) return false;
            else{
                maxReach = Math.max(maxReach,i+nums[i]);
            }
        }
        return true;
    }
}


















