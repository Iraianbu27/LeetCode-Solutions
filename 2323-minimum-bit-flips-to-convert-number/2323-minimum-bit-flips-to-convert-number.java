class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        int difference = (start ^ goal);
        // int length = 0;

        while(difference > 0)
        {
           difference =  (difference & (difference-1));
           count++;
        }
        return count;

        // while(start > 0)
        // {

        //     int bit = start>>1;
        //     length++;
        //     start = start /2;
        // }
        // for(int i = 0;i<length;i++)
        // {
        //     if((difference & (1<<i)) != 0)
        //     {
        //         count = count + 1;
        //     }
        // }
        // return count;
    }
}