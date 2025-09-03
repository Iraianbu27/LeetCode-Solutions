class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n];
        
        int left = 0;
        int right = 0;
        int index = 0;

        // Merge both arrays
        while (left < m && right < n) {
            if (nums1[left] < nums2[right]) {
                nums[index++] = nums1[left++];
            } else {
                nums[index++] = nums2[right++];
            }
        }

        // Copy remaining from nums1
        while (left < m) {
            nums[index++] = nums1[left++];
        }

        // Copy remaining from nums2
        while (right < n) {
            nums[index++] = nums2[right++];
        }

        // Copy merged array back into nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = nums[i];
        }
    }
}