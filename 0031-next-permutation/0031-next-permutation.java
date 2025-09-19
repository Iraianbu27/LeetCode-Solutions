    class Solution {
        public void nextPermutation(int[] nums) {
            int breakPoint = -1;
            int n = nums.length ;
            //1.find the break point
            int val = nums[n-1];
            for(int i = n-2;i>=0;i--)
            {
                if(nums[i] >= val)
                {
                   val = nums[i];
                }
                else{
                    breakPoint = i;
                    break;
                }
            }
            if(breakPoint == -1) //input = 5,4,3,2,1 -> no next premutaion so return the first permutation -> 1 2 3 4 5
            {
                reverseArr(nums,0);
                return ;
            }

            //2.find the greatest least element of break point in breakPoint+1 to n-1 in //nums
            for(int i = n-1;i>breakPoint;i--)
            {
                if(nums[i] > nums[breakPoint])
                {
                    int thVar = nums[breakPoint];
                    nums[breakPoint] = nums[i];
                    nums[i] = thVar;
                    break;
                }
                
            }

            //3. sort the subarray starting from next of breakPoint
             reverseArr(nums,breakPoint + 1);
        
        // 4. reverse the suffix
        }
        public void reverseArr(int[] nums, int i)
        {
            int j=nums.length -1;
            while(i<=j)
            {
                int thVar = nums[i];
                nums[i] = nums[j];
                nums[j] = thVar;
                i++;
                j--;
            }
            // return nums;
        }
    }