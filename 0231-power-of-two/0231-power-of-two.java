class Solution {
    // public static boolean recPowerOfTwo(int i , int n){
    //     //base case
    //     if(((long)(Math.pow(2,i) )) == (long)n){
    //         return true;
    //     }
    //     if(((long)(Math.pow(2,i))) >(long) n)
    //     {
    //         return false;
    //     }
    //     return recPowerOfTwo(i+1,n);
    // }
    // public boolean isPowerOfTwo(int n) {
    //     if(n<=0){
    //         return false;
    //     }
    //     // boolean result = false;
 
         
       
    //     return recPowerOfTwo(0,n);
         
        
        
    // }
    public boolean isPowerOfTwo(int n)
    {
        //  if(n>0)
        //  {
        //     if((n & (n-1)) == 0){
        //         return true;
        //     }
        //  }
        //  return false;
       if(n<=0) return false;
       if(n==1) return true;
       if((n & (n-1)) == 0)
       {
        return true;
       }
       return false;
   
}}