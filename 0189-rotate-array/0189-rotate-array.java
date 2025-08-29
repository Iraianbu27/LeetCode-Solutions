import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
    public void reverse(int[] nums,int left,int right)
    {
        while(left < right)
        {
            int thVar = nums[left];
            nums[left] = nums[right];
            nums[right] = thVar;
            left++;
            right--;
        }
    }
}

        // int n = nums.length;
        // k = k%n;
        // reverse(nums,0,n-1);
        // reverse(nums,0,k-1);
        // reverse(nums,k,n-1);





    // public void reverse(int[] nums,int start,int end)
    // {
    //     while(start<end)
    //     {
    //         int thVar = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = thVar;
    //         start++;
    //         end--;
    //     }
    // }



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //     int n = nums.length;
    //     k = k % n;  // Always reduce k

    //     List<Integer> list = new ArrayList<>();

    //     int start = n - k;
    //     for (int i = start; i < n; i++) {
    //         list.add(nums[i]);
    //     }

    //     for (int i = 0; i < start; i++) {
    //         list.add(nums[i]);
    //     }

    //     for (int i = 0; i < n; i++) {
    //         nums[i] = list.get(i);
    //     }
    // }

