class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastSeen = {-1,-1,-1}; //initializing abc
        int count=0;
        for(int r=0;r<s.length();r++)
        {
            lastSeen[s.charAt(r) - 'a'] = r; // changing the value of visited index to 1
            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1 )
            {
                count = count + (Math.min(lastSeen[0], Math.min(lastSeen[1] , lastSeen[2])) + 1);
            }
        }
        return count;

    }
}