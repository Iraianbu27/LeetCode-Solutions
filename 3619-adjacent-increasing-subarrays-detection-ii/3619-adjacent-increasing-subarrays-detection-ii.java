import java.util.*;

class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        if (n < 2) return 0;

        int[] incEnd = new int[n];
        int[] incStart = new int[n];

        // Length of increasing subarray ending at i
        incEnd[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                incEnd[i] = incEnd[i - 1] + 1;
            } else {
                incEnd[i] = 1;
            }
        }

        // Length of increasing subarray starting at i
        incStart[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums.get(i) < nums.get(i + 1)) {
                incStart[i] = incStart[i + 1] + 1;
            } else {
                incStart[i] = 1;
            }
        }

        // Compute the maximum k for adjacent subarrays
        int maxK = 0;
        for (int i = 0; i < n - 1; i++) {
            maxK = Math.max(maxK, Math.min(incEnd[i], incStart[i + 1]));
        }

        return maxK;
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
