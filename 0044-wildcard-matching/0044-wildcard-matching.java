// //tabulation
// class Solution {
//     public int recFunction(String str1,String str2,int[][] dp,int index1,int index2){
//         if(index1 <0 && index2 <0)return 1;
//         if(index2 < 0 && index1>=0)return 0;
//         if(index1 <0 && index2 >=0){
//             for(int i = 0;i<=index2;i++){
//                 if(str2.charAt(i) != '*')return 0;
//             }
//             return 1;
//         } 
//         if(dp[index1][index2] != -1)return dp[index1][index2];
//         int star1 = -1,star2=-1;
//         if(str1.charAt(index1) == str2.charAt(index2) ||  str2.charAt(index2) == '?'){
//             return dp[index1][index2] = recFunction(str1,str2,dp,index1-1,index2-1);
//         }
        
//         else if(str2.charAt(index2) == '*'){
//               star1 = recFunction(str1,str2,dp,index1-1,index2);
//               star2 = recFunction(str1,str2,dp,index1,index2-1);
//             return dp[index1][index2] = (star1 ==1||star2 == 1)?1:0;
//         }
//         return 0;
//         }
        
    
//     public boolean isMatch(String s, String p) {
//         int len1 = s.length();
//         int len2 = p.length(); 
//         boolean[][] dp = new boolean[len1+1][len2+1]; 
//         dp[0][0] = true;
//         for(int index1 = 1;index1<len1+1;index1++){
//             dp[index1][0] = false;
//         }

//     }
// }
//memoization
class Solution {
    public int recFunction(String str1,String str2,int[][] dp,int index1,int index2){
        if(index1 ==0 && index2 ==0)return 1;
        if(index2 == 0 && index1>=1)return 0;
        if(index1 <1 && index2 >=1){
            for(int i = 1;i<=index2;i++){
                if(str2.charAt(i-1) != '*')return 0;
            }
            return 1;
        } 
        if(dp[index1][index2] != -1)return dp[index1][index2];
        int star1 = -1,star2=-1;
        if(str1.charAt(index1-1) == str2.charAt(index2-1) ||  str2.charAt(index2-1) == '?'){
            return dp[index1][index2] = recFunction(str1,str2,dp,index1-1,index2-1);
        }
        
        else if(str2.charAt(index2-1) == '*'){
              star1 = recFunction(str1,str2,dp,index1-1,index2);
              star2 = recFunction(str1,str2,dp,index1,index2-1);
            return dp[index1][index2] = (star1 ==1||star2 == 1)?1:0;
        }
        return 0;
        }
        
    
    public boolean isMatch(String s, String p) {
        int len1 = s.length();
        int len2 = p.length(); 
        int[][] dp = new int[len1+1][len2+1];
        for(int[] i:dp)Arrays.fill(i,-1);
        int val = recFunction(s,p,dp,len1,len2);
        if(val == 1)return true;
        return false;
    }
}
// //recurssion
// class Solution {
//     public boolean recFunction(String str1,String str2,int index1,int index2){
//         if(index1 <0 && index2 <0)return true;
//         if(index2 < 0 && index1>=0)return false;
//         if(index1 <0 && index2 >=0){
//             for(int i = 0;i<=index2;i++){
//                 if(str2.charAt(i) != '*')return false;
//             }
//             return true;
//         } 
//         if(str1.charAt(index1) == str2.charAt(index2) ||  str2.charAt(index2) == '?'){
//             return recFunction(str1,str2,index1-1,index2-1);
//         }
//         else if(str2.charAt(index2) == '*'){
//             return recFunction(str1,str2,index1-1,index2)||recFunction(str1,str2,index1,index2-1);
//         }
//         return false;
//     }
//     public boolean isMatch(String s, String p) {
//         int len1 = s.length();
//         int len2 = p.length(); 
//         // if(len2 > 0 && p.charAt(0) == '*')return true;
//         return recFunction(s,p,len1-1,len2-1);
//     }
// }