class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] prev2 = new int[2];
        int[] prev = new int[2];
        // int[] curr = new int[2];

        for(int index = n-1;index>=0;index--){
                    
        int[] curr = new int[2];
                int profit = 0;
                curr[1] = Math.max(-prices[index] + prev[0],prev[1]);
                curr[0]=Math.max( prices[index] + prev2[1],prev[0]);
            
            prev2 = prev;
            prev =  curr;
        }
        return prev[1];
    }
}

//// tabulation
// class Solution {
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int[][] dp = new int[n+2][2];
//         for(int index = n-1;index>=0;index--){
//             for(int buy = 0;buy<2;buy++){
//                 int profit = 0;
//                 if(buy == 1){
//                     profit = Math.max(-prices[index] + dp[index+1][0],dp[index+1][1]);
//                 }
//                 else{// 5
//                     profit=Math.max( prices[index] + dp[index+2][1],dp[index+1][0]);
//                 }
//                 dp[index][buy] = profit;
//             }
//         }
//         return dp[0][1];
//     }
// }


//// memoization
// class Solution {
//     public int recFunction(int[] prices,int index,int buy,int[][] dp){
//         if(index >= prices.length)return 0;
//         if(dp[index][buy] != -1)return dp[index][buy];
//         int profit = 0;
//         if(buy == 1){
//             profit = Math.max(-prices[index] + recFunction(prices,index+1,0,dp),recFunction(prices,index+1,1,dp));
//         }
//         else{
//             profit=Math.max( prices[index] + recFunction(prices,index+2,1,dp),recFunction(prices,index+1,0,dp));
//         }
//         return dp[index][buy] = profit;
//     }
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int[][] dp = new int[n+1][2];
//         for(int[] array : dp)Arrays.fill(array,-1);
//         return recFunction(prices,0,1,dp);
//     }
// }

////recurssion
// class Solution {
//     public int recFunction(int[] prices,int index,int buy){
//         if(index >= prices.length)return 0;
//         int profit = 0;
//         if(buy == 1){
//             profit = Math.max(-prices[index] + recFunction(prices,index+1,0),recFunction(prices,index+1,1));
//         }
//         else{
//             profit=Math.max( prices[index] + recFunction(prices,index+2,1),recFunction(prices,index+1,0));
//         }
//         return profit;
//     }
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         return recFunction(prices,0,1);
//     }
// }