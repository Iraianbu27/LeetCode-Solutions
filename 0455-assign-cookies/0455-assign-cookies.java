class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gLen = g.length;
        int sLen = s.length;
        int l=0,r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l<gLen && r<sLen)
        {
            if(g[l] <= s[r]){
                l++;
                // r++;
            }
            // else{
            //     r++;
            // }
            r++;
        }
        return l;
    }
}
//int gLen = g.length;
        // int sLen = s.length;
        // int count = 0;
        // boolean[] used = new boolean[sLen];
        // for(int i = 0;i<gLen;i++)
        // {
        //     for(int j = 0;j<sLen;j++)
        //     {
        //         if(!used[j] && s[j] >= g[i])
        //         {
        //             used[j] = true;
        //             count++;
        //             break;
        //         }
        //     }
        // }
        // return count;