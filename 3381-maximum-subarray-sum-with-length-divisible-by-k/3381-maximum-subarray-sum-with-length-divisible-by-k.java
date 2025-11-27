class Solution {

    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long prefixSum = 0;
        long maxSum = Long.MIN_VALUE;
        long[] kSum = new long[k];
        for (int i = 0; i < k; i++) {
            kSum[i] = Long.MAX_VALUE / 2;
        }
        kSum[k - 1] = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            maxSum = Math.max(maxSum, prefixSum - kSum[i % k]);
            kSum[i % k] = Math.min(kSum[i % k], prefixSum);
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