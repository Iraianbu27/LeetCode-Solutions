class Solution {
    public int[] getNoZeroIntegers(int n) {
         for(int i = 1;i<n;i++)
         {
            int j = n-i;
            if(!containsZero(i) && !containsZero(j))
            {
                return new int[] {i,j};
            }
         }
         return new int[0];
    }
    public static boolean containsZero(int n)
    {
        while(n>0){
            int rem = n%10;
            if(rem == 0) return true;
            n = n/10;
        }
        return false;
    }
}