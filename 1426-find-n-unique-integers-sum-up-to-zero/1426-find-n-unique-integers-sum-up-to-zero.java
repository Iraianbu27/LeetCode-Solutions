class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
         arr[0] = n * (1-n) / 2;
        for(int i = 1;i<n;i++)
        {
            arr[i] = i;
        }
        return arr;
}
}