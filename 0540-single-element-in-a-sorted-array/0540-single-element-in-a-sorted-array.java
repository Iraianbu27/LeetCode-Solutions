class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0,high = nums.length-1;
        int mid = 0;
        while(low <= high)
        {
            mid = (low + high)/2;
            if(mid == low && mid == high || ((nums[mid] != nums[mid +1]) && (nums[mid] != nums[mid-1])))
            {
                return nums[mid];
            }
            if(mid%2 == 0)
            {
                if(nums[mid] == nums[mid +1])
                {
                    low = mid + 2;
                }
                else{
                    high = mid - 2;
                }
            }
            else{
                if(nums[mid] != nums[mid+1]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }

        }
        return -1;
    }
}