import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int l = 0, max = 0;

        for(int r = 0; r < s.length(); r++){   
            if(map.containsKey(s.charAt(r))){
                // shift l only if it's behind the duplicate
                l = Math.max(l, map.get(s.charAt(r)) + 1);
            }

            // update the character’s latest index
            map.put(s.charAt(r), r);

            // check max window size
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
