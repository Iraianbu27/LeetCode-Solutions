class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int maxEnergy = Integer.MIN_VALUE;
        
        // Process from right to left
        for(int i = n - 1; i >= 0; i--) {
            // If there's a position k steps ahead, add its sum to current
            if(i + k < n) {
                energy[i] += energy[i + k];
            }
            // Track maximum
            maxEnergy = Math.max(maxEnergy, energy[i]);
        }
        
        return maxEnergy;
    }
}