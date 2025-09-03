class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        int length = m+n;
   
 
  
        for(int i = m;i<nums1.length;i++)
        {
            if(n == 0) break;
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
     
    }
}