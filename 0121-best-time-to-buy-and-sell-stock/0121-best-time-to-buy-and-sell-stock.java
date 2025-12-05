// class Solution {
//     public int maxProfit(int[] prices) {
//         int minValue = prices[0];
//         int profit = 0;
//         for(int i = 1;i<prices.length;i++)
//         {
//             // if(prices[i] < minValue)
//             // {
//                 minValue = Math.min(minValue,prices[i]); //finding the minimum value dynamicaly
//             // }
//             // else if(prices[i] - minValue > profit)
//             // {
//                 profit = Math.max(profit,prices[i] - minValue);
//             // }
//         }
//         return profit;
//     }
// }
// class Solution {
//     public int maxProfit(int[] prices) {
//         int minValue = Integer.MAX_VALUE;
//         int profit = 0;
//         for(int i = 0;i<prices.length;i++)
//         {
//             if(prices[i] < minValue)
//             {
//                 minValue = prices[i]; //finding the minimum value dynamicaly
//             }
//             else if(prices[i] - minValue > profit)
//             {
//                 profit = prices[i] - minValue;
//             }
//         }
//         return profit;
//     }
// }

class Solution{
    public int maxProfit(int[] prices){
        int n = prices.length;
        int buy = prices[0];
        int maxProfit = 0;
        for(int i=1;i<n;i++){
            
            if(prices[i]<buy){
                buy = prices[i];
            }
            else if(prices[i]-buy > maxProfit){
                maxProfit = prices[i]-buy;
            }
            // else{
            //     int profit = prices[i]-buy;
            //     maxProfit = Math.max(maxProfit,profit);
            // }
        }
        return maxProfit;
    }
}