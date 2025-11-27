class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        // long maxSum = Long.MIN_VALUE;
        long[] prefixSum = new long[n+1];
        for(int i = 0;i<n;i++){
            prefixSum[i+1]=nums[i]+prefixSum[i];
        }
        long[] minPrefix = new long[k];
        Arrays.fill(minPrefix,Long.MAX_VALUE/2);
        long maxSum = Long.MIN_VALUE;
        for(int j = 0;j<=n;j++){
            int mod = j%k;
            maxSum = Math.max(maxSum,prefixSum[j]-minPrefix[mod]);
            minPrefix[mod] = Math.min(minPrefix[mod],prefixSum[j]);
            
        }
        return maxSum;

    }
}
//// Brute force
// class Solution {
//     public long maxSubarraySum(int[] nums, int k) {
//         int n = nums.length;
//         long maxSum = Long.MIN_VALUE;
//         for(int i = 0;i<n;i++){
//             int length = 0; 
//             long currValue = 0;
//             for(int j = i;j<n;j++){
//                 length++;
//                 currValue += nums[j];
//                 if(length % k == 0){
//                     maxSum = Math.max(currValue,maxSum);
//                 }
//             }
//         }
//         return maxSum;

//     }
// }