class Solution {
    //gready approach 
    public int maxDistinctElements(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        int prev= Integer.MIN_VALUE;    
        for(int i : nums){
            int curr = Math.min(Math.max(i-k,prev+1),i+k);
            if(curr > prev){
                count++;
                prev = curr;
            }
        }
        return count;
    }
}