class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low =  0,high = 0;
        int output = 0;
        for(int i : weights)
        {
        
            low = Math.max(low,i);
            high = high + i;
        }
        int mid = 0;
        while(low <= high)
        {
            mid = (low + high)/2;
            // finding the correct  weight  to ship within given days
            int weight = 0;
            int day = 1;
            for(int i = 0;i<weights.length;i++)
            {
                if((weight + weights[i]) <= mid)
                {
                    weight = weight + weights[i];
                }
                else{
                    weight = weights[i];
                    day++;
                }
            }
            // continuing binary search

            if(day <= days)
            {
                output = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return output;
    }
}