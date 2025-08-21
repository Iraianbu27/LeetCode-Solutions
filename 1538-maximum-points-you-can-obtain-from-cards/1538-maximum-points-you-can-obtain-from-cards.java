class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftCount = 0;
        int rightCount = 0;
        int maxCount = 0;
        for(int i = 0;i<k;i++)
        {
            leftCount += cardPoints[i];
        }
        maxCount = leftCount;
        if(cardPoints.length == k) return maxCount;
        int l=cardPoints.length -1;
        for(int r=k-1;r>=0;r--)
        {
            leftCount -= cardPoints[r];
            rightCount += cardPoints[l];
            l--;
            maxCount = Math.max(maxCount,leftCount + rightCount);
        }
        return maxCount;
    }
}