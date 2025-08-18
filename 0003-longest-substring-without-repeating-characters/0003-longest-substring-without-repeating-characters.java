import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character,Integer> map = new HashMap<>();
        int l=0,max=0;
        int n = s.length();
        for(int r=0;r<n;r++){   
            if(map.containsKey(s.charAt(r))){
                 //updated the index of dup ele
                if(l <= map.get(s.charAt(r)))
                {
                    l = map.get(s.charAt(r)) + 1;
                }
                // map.put(s.charAt(r),r);

            }


            
                map.put(s.charAt(r),r);
            
            //adding element with index on map
            if(max < (r-l+1)){ //finding max length
                max = r-l+1;
            }
        }
return max;
    }}
        // FIRST ATTEMPT
        // Set<Character> set = new HashSet<>();
        // int l = 0;
        // int max = 0;
        // int n = s.length();
        // for(int r = 0;r<n;r++)
        // {
        //     if(set.contains(s.charAt(r)))
        //     {
        //         while(l<r && set.contains(s.charAt(r))){ //bring l next to the duplicate elemnt index
        //             set.remove(s.charAt(l));
        //             l++;
        //         }
        //     }
        //     set.add(s.charAt(r)); //adding ele to set
        //     if(max < (r-l+1)){
        //         max = r-l+1;
        //     }
        // }
        // return max; 
 
 