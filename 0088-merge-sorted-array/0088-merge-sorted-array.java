class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {       
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i >= 0 && j >= 0)
        {
            if(nums1[i] > nums2[j])
            {
                nums1[k--] = nums1[i--];
              
            }
            else{
                nums1[k--] = nums2[j--];
              
              
            }
        }
        while(j>=0)
        {
            nums1[k--] = nums2[j--];
        }
    }
}
    
    //  int i = m - 1;
    //     int j = n - 1;
    //     int k = m + n - 1;
    //     while(i >= 0 && j >= 0) {
    //         if(nums1[i] > nums2[j]) {
    //             nums1[k--] = nums1[i--];
    //         }
    //         else {
    //             nums1[k--] = nums2[j--];
    //         }

    //     }
    //     while(j >= 0) {

    //         nums1[k--] = nums2[j--];
    //     }
    // }
    //     int i = 0,j=0,index = 0;
    //     int[] arr = new int[m+n];
    //     while(i< m && j < n)
    //     {
    //         if(nums1[i] <= nums2[j])
    //         {
    //             arr[index++] = nums1[i++];
    //         }
    //         else{
    //             arr[index++] = nums2[j++];
    //         }
    //     }
    //     while(i<m)
    //     {
    //         arr[index++] = nums1[i++];
    //     }
    //     while(j<n)
    //     {
    //         arr[index++] = nums2[j++];
    //     }
    //     for(int o = 0;o<m+n;o++)
    //     {
    //         nums1[o]=arr[o];
    //     }

 //---------------------
// brute force (O(n log n + 3)) ~ O(n log n)
// for(int i = m;i<nums1.length;i++)
//         {
//             if(n == 0) break;
//             nums1[i] = nums2[j];
//             j++;
//         }
//         Arrays.sort(nums1);