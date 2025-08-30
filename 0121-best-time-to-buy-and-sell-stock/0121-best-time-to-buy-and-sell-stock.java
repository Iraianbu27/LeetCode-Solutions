class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0;i<prices.length;i++)
        {
            if(prices[i] < minValue)
            {
                minValue = prices[i]; //finding the minimum value dynamicaly
            }
            else if(prices[i] - minValue > profit)
            {
                profit = prices[i] - minValue;
            }
        }
        return profit;
}
}
        //int min = Integer.MAX_VALUE;
        // int max = -1;
        // int maxIndex=0;
        // int minIndex=0;
        // for(int i = 0;i<prices.length;i++)
        // {
        //    if(min>prices[i])
        //    {
        //     min = prices[i];
        //     minIndex = i;
        //    }
        // }
         
        // if(minIndex == (prices.length - 1)){
        //     return 0;
        // }
        // // else if((prices.length == 2) && (minIndex == 0))
        // // {
        // //     return prices[1]-prices[0];
        // // }
        // else
        // {
        //     for(int i = minIndex + 1;i<prices.length;i++)
        //     {
        //          if(max < prices[i])
        //             {
        //                 max = prices[i];
        //                 maxIndex = i;

        //             }
        //     }
        // }
        // return max-min;
        // int max=0,min = Integer.MAX_VALUE;
        // int maxIndex = 0,minIndex = 0;
        // for(int i=0;i<prices.length;i++)
        // {
        //     if(max < prices[i])
        //     {
        //         max = prices[i];
        //         maxIndex = i;

        //     }
        //     if(min >prices[i]){
        //         min = prices[i];
        //         minIndex = i;
        //     }
        // }
        // if(minIndex == (prices.length - 1))
        // {
        //     return 0;
        // }
        // return max-min;