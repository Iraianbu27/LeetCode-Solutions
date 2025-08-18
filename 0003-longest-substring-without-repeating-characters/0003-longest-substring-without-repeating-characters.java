import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int max = 0;
        int n = s.length();
        for(int r = 0;r<n;r++)
        {
            if(set.contains(s.charAt(r)))
            {
                while(l<r && set.contains(s.charAt(r))){ //bring l next to the duplicate elemnt index
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r)); //adding ele to set
            if(max < (r-l+1)){
                max = r-l+1;
            }
        }
        return max; 
        
    }
}