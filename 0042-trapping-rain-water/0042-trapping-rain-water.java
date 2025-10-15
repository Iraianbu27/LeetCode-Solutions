class Solution {
    
    public int trap(int[] heights) {
        int lMax = 0;
        int rMax = 0;
        int tot = 0;
        int l = 0;
        int n = heights.length;
        int r = n - 1;
        while(l<r){
            // if(l>0 && heights[l] < lMax){
            //     tot += lMax - heights[l];
            // } 
            // else if(r< n && heights[r] < rMax){
            //     tot+= rMax - heights[r];

            // }
            if(heights[l] <= heights[r]){
                if(heights[l] < lMax){
                    tot += lMax - heights[l];
                }
                lMax = Math.max(lMax,heights[l]);
                l++;
            }
            else{
                if(heights[r] < rMax){
                    tot += rMax - heights[r];
                }
                rMax = Math.max(rMax,heights[r]);
                r--;
            }
        }
        return tot;
         
    }
}
//BETTER APPROACH with TC-O(3n),SC-O(2n)
// class Solution {
//     public static int[] leftMax(int[] arr)
//     {
//         int[] lt = new int[arr.length];
//         lt[0] = arr[0];
//         for(int i = 1;i<arr.length;i++)
//         {
//             lt[i] = Math.max(lt[i-1],arr[i]);
//         }
//         return lt;
//     }
//     public static int[] rightMax(int[] arr)
//     {
//         int n = arr.length;
//         int[] rg = new int[arr.length];
//         rg[n-1] = arr[n-1];
//         for(int i = n-2;i>=0;i--)
//         {
//             rg[i] = Math.max(rg[i+1],arr[i]);
//         }
//         return rg;
//     }
//     public int trap(int[] height) {
//         int n = height.length;
//         int total = 0;
//         int[] lt = new int[n];
//         int[] rg = new int[n];
//         lt = leftMax(height);
//         rg = rightMax(height);

//         for(int i = 0;i<n;i++)
//         {
//             if(height[i] < lt[i] && height[i] < rg[i])
//             {
//                 total += Math.min(lt[i],rg[i]) - height[i];
//             }
//         }
//         return total;
//     }
// }