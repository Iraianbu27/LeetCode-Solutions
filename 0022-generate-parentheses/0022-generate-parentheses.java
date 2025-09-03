import java.util.*;
class Solution {
   public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", n, n);
        return result;
    }
     private static void backtrack(List<String> result, String current, int openRemaining, int closeRemaining) {
        // Base case: no brackets left
        if (openRemaining == 0 && closeRemaining == 0) {
            result.add(current);
            return;
        }

        // Pick '(' if available
        if (openRemaining > 0) {
            backtrack(result, current + "(", openRemaining - 1, closeRemaining);
        }

        // Pick ')' if it keeps validity
        if (closeRemaining > openRemaining) {
            backtrack(result, current + ")", openRemaining, closeRemaining - 1);
        }
    }
}

 
 

   

     

