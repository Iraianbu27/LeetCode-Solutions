import java.util.*;
class Solution {
    public int splitArray(int[] nums, int k) {
        return binarySearch(nums,k);

    }

    public int binarySearch(int[] nums,int k)
    {
        int low =  Arrays.stream(nums).max().getAsInt();
        //Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        int mid = 0;
        while(low<= high)
        {
            mid = (low + high)/2;
            int setK = set(nums,mid);
            if(setK > k)
            {
                low = mid + 1; // go find a smaller set
            }
            else{
                high = mid - 1; // go find a larger set
            }
        }
        return low;
    }
    //return how many set created with given mid
    public int set(int[] nums,int mid)
    {
        int setK = 1;
        int countInSet = 0;
        for(int i:nums)
        {
            if(i+countInSet <= mid)
            {
                countInSet += i;
            }
            else{
                setK++;
                countInSet = i;
            }
        }
        return setK;
    }
}