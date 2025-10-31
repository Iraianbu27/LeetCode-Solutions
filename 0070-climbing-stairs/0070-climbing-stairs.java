// class Solution
//  {
//     public int recFunction(int n ,int[] dp){
//         if(n <= 1){
//             if(n == 0 || n == 1)return 1;
//             return 0;
//         }
//         if(dp[n] != 0)return dp[n];
//         dp[n-1] = recFunction(n-1,dp);
//         dp[n-2] =recFunction(n-2,dp);
//         return dp[n-1]+dp[n-2];

//     }
//     public int climbStairs(int n) {
//         int[] dp = new int[n+1];
        
//         return recFunction(n,dp);
        
//     }
// }


//tabulation method
// class Solution{
//         public int climbStairs(int n) {
//         int[] dp = new int[n+1]; 
//         dp[0] = 1;
//         dp[1] = 1;
//         for(int i = 2;i<=n;i++){
//             dp[i]=dp[i-1]+dp[i-2];
//         }
//         return dp[n];
        
//     }
// }


//space optimization
class Solution{
        public int climbStairs(int n) {
        
        int prev1 = 1;
        int prev2 =1;
        for(int i = 2;i<=n;i++){
            int currVal = prev2 + prev1;
            prev2 = prev1;
            prev1 = currVal;
        }
        return prev1;
        
    }
}

