// class Solution {
//     public void moveZeroes(int[] nums) {
//         int left = 0,right=0;
//         int n = nums.length;
//         while(right < n)
//         {
//             if(nums[right] != 0)
//             {
//                 nums[left] = nums[right];
//                 left++;
//             }
//             right++;
//         }
//         // left++;
//         while(left<n)
//         {
//             nums[left] = 0;
//             left++;
//         }


//     }
// }

class Solution {
    public void helperFunction(int[] nums){
        int i = 0;
        int n = nums.length;
        while(i<n && nums[i] != 0){
            i++;
        }
        int j=i+1;
        while(j<n){
            if(nums[j] != 0){
                int thVar = nums[i];
                nums[i] = nums[j];
                nums[j] = thVar;
                i++;
            }
            j++;

        }
    }
    public void helperFunction2(int[] nums){
        int n = nums.length;
        int i = 0,j=0;
        while(j<n){
            if(nums[j] != 0){
                int thVar = nums[i];
                nums[i] = nums[j];
                nums[j] = thVar;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        while(i<n){
            nums[i] = 0;
            i++;
        }
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // helperFunction(nums);
        helperFunction2(nums);

    }
}
















        // int i = 0,j=i+1;
        // for(int k = 0;k<=nums.length-2;k++)
        // {
        //     if(nums[i] == 0)
        //     {
        //         if(nums[i] != nums[j])
        //         {
        //             int thVar = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = thVar;
        //             i++;
        //             j++;
        //         }
        //         else{
        //             j++;
        //         }
        //     }
        //     else{
        //         i++;
        //         j++;
        //     }

        // }
        
