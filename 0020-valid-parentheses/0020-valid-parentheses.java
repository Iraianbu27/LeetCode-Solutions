import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        // boolean op = false;
        if(s.length() <= 1)
        {
            return false;
        }
        // else {
        //     char closBrac = s.charAt(0);
        //     if(closBrac ==')' || closBrac =='}' || closBrac ==']') return false;
        // }
        for(char i : s.toCharArray())
        {
            if(i == '(' || i == '{' || i == '[')
            {
                st.push(i);
            }
            else{
                // char peek;
                if(st.isEmpty()  ) return false;
                char peek = st.pop();
                if((i == ')' && peek == '(') || (i == '}' && peek == '{') || (i == ']' && peek == '[')) {
                     
                    continue;
                }
                else{
                    return  false;
                }
            }
        }
        return st.isEmpty();
    }
}