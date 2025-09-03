class Solution {
    public int maxProduct(int[] nums) {
        int prefix = 1,suffix =1;
        int product = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0;i<nums.length;i++)
        {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[n-i-1];
            product = Math.max(product,Math.max(prefix,suffix));
        } 
        return product;
    }
}
// int largestProduct = Integer.MIN_VALUE;
        // for(int i = 0;i<nums.length;i++)
        // {
        //      int product = 1;
        //     for(int j = i;j<nums.length;j++)
        //     {
        //        product *= nums[j];
        //         largestProduct = Math.max(largestProduct,product);
        //     }
            
        // }
        // return largestProduct;
// -----------------------
// int n = nums.length;
//         int product = 1;
//         int largestProduct = Integer.MIN_VALUE;
//         int countNegative = 0;
//         for(int i: nums)
//         {
//             if(i<0) countNegative++;           
//         }
//         for(int i = 0;i<nums.length;i++)
//         {
//             product *= nums[i];
            
//             if(largestProduct < product)
//             {
//                 largestProduct = product;
//             }
//             //if following element is negative dont change the product
//            if(product<0)
//            {
//             countNegative--; //1
//             if(largestProduct <0 && countNegative >0)
//             {
//                 largestProduct = product;
//             }
//             if(countNegative == 0)
//             {
//                 product = 1;
//             }
//            }
//            if(product == 0)
//            {
//             product = 1;
//            }
//         }