class Solution {
    public long maxSubarraySum(int[] nums, int k) {

        int n = nums.length;
        long[] prefix = new long[n + 1];

        // Build prefix sum
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // minPrefix[r] = smallest prefix value seen with index % k == r
        long[] minPrefix = new long[k];
        Arrays.fill(minPrefix, Long.MAX_VALUE);

        long ans = Long.MIN_VALUE;

        for (int i = 0; i <= n; i++) {

            int mod = i % k;

            // If a previous prefix with the same mod exists,
            // we can form a subarray whose length % k == 0
            if (minPrefix[mod] != Long.MAX_VALUE) {
                long candidate = prefix[i] - minPrefix[mod];
                ans = Math.max(ans, candidate);
            }

            // Update smallest prefix for this remainder class
            minPrefix[mod] = Math.min(minPrefix[mod], prefix[i]);
        }

        return ans;
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