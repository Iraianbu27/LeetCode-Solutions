import java.util.*;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount = 0;  // counts missing numbers
        int current = 1;       // start checking from 1
        int i = 0;             // pointer for arr

        while (missingCount < k) {
            // if current is in arr, move arr pointer
            if (i < arr.length && arr[i] == current) {
                i++;
            } else {
                // current is missing
                missingCount++;
                if (missingCount == k) {
                    return current;
                }
            }
            current++;
        }

        return -1; // should never reach here
    }
}
