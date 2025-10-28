class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = bloomDay[0];
        int high =  bloomDay[0];
        if((long)(m*k) > (bloomDay.length)) return -1;
        for(int i:bloomDay)
        {
            if(i>high)high = i;
            if(i<low)low = i;
        } 
        int mid = 0;
        int result = -1;
        while(low<=high)
        {
            mid = (high+low)/2;
            if(func(bloomDay ,mid,m,k)){
                result = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }

        }
        return result;
    }
    public boolean func(int[] bloomDay, int i,int m,int k)
    {
            int tot =0;
            int countFlower = 0;
            for(int j = 0;j<bloomDay.length;j++)
            {
                if(bloomDay[j] <= i)
                {
                    countFlower = countFlower + 1;         
                }
                else{
                    tot = tot + (int)(countFlower/k);
                    countFlower = 0;
                   

                }
                
            }
            tot = tot + (int)(countFlower/k);
            if(tot >= m)
            { 
                return true;
            }
        
        return false;
           
    }
}