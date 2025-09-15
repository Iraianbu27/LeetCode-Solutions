class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long total = 0;
        for(int i = 0;i<n;i++)
        {
            long sum = 0;
            int maxValue = Integer.MIN_VALUE;
            int minValue = Integer.MAX_VALUE;
            for(int j = i;j<n;j++)
            {
                maxValue = Math.max(maxValue,nums[j]);
                minValue = Math.min(minValue,nums[j]);
                sum = sum + ((long)maxValue - (long)minValue);
            }
            total += sum;

        }
        return total;
    }
}