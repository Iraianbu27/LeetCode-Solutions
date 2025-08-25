import java.util.*;

class Solution {
    public int findKthPositive(int[] arr, int k) {
     int low = 0, high=arr.length-1;
     int mid = 0;
     int missingValue = 0;
     while(low <= high)
     {
        mid = (low + high)/2;
        missingValue = arr[mid] - (mid+1); //actual value that should be at mid index
        // if actual value is lesser than needed(k) mid+1;
        if(missingValue < k)
        {
            low = mid + 1;
        }
        else if(missingValue >= k){
            high = mid - 1;
        }
     }
     return (low+k);
    }
}

// OPTIMAL SOLUTION
//  int n = arr.length;
    //     for(int i = 0;i<n;i++)
    //     {
    //         if(arr[i] <= k)
    //         {
    //             k++;
    //         }
    //         else{
    //             break;
    //         }
            

    // }
    // return k;
  
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

        // approach 2 FAILED    
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