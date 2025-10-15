class Solution {

    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int cnt = 1;
        int precnt = 0;
        int ans = 0;

        for (int i = 1; i < n; ++i) {
            if (nums.get(i) > nums.get(i - 1)) {
                ++cnt;
            } else {
                precnt = cnt;
                cnt = 1;
            }
            ans = Math.max(ans, Math.min(precnt, cnt));
            ans = Math.max(ans, cnt / 2);
        }

        return ans;
    }
}

// import java.util.*;

// class Solution {
//     public int maxIncreasingSubarrays(List<Integer> nums) {
//         int n = nums.size();
//         int maxK = 0;

//         // Try every possible k
//         for (int k = 1; k <= n / 2; k++) {
//             // Try every starting index for two adjacent subarrays
//             for (int i = 0; i + 2 * k <= n; i++) {
//                 // First subarray: nums[i .. i+k-1]
//                 // Second subarray: nums[i+k .. i+2k-1]
//                 if (isIncreasing(nums, i, i + k - 1) && 
//                     isIncreasing(nums, i + k, i + 2 * k - 1)) {
//                     maxK = Math.max(maxK, k);
//                 }
//             }
//         }

//         return maxK;
//     }

//     // Helper to check if subarray nums[l..r] is strictly increasing
//     private boolean isIncreasing(List<Integer> nums, int l, int r) {
//         for (int i = l + 1; i <= r; i++) {
//             if (nums.get(i) <= nums.get(i - 1)) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
