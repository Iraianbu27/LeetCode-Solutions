import java.util.*;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            if(arr[i] <= k)
            {
                k++;
            }
            else{
                break;
            }
            
        // BRUTE FORCE WITH 0MS      
        //     if(arr[i] > k)
        //     {
        //         return k;
        //     }
        //     else{
        //         k++;
        //     }
        // }
        // if(k != 0)
        // {
        //     return k;
        // }
        // return 0;
    }
    return k;
    }
}
        // int missingCount = 0;  // counts missing numbers
        // int current = 1;       // start checking from 1
        // int i = 0;             // pointer for arr

        // while (missingCount < k) {
        //     // if current is in arr, move arr pointer
        //     if (i < arr.length && arr[i] == current) {
        //         i++;
        //     } else {
        //         // current is missing
        //         missingCount++;
        //         if (missingCount == k) {
        //             return current;
        //         }
        //     }
        //     current++;
        // }

        // return -1; // should never reach here