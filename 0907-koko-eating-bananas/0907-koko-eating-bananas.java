class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        
        for(int pile : piles) {
            right = Math.max(right, pile);
        }
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            long count = 0;  // Use long to avoid overflow!
            
            for(int pile : piles) {
                count += (pile + mid - 1) / mid;
            }
            
            if(count <= h) {
                right = mid - 1;  // Try smaller speed
            } else {
                left = mid + 1;   // Need faster speed
            }
        }
        
        return left;  // Return the minimum valid speed
    }
}