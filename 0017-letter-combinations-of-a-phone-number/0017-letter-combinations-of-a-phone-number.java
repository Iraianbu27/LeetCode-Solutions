// class Solution {
//     public void backtracking(char[] input,Map<Character,String[]> mpp,List<List<String>> list,int n,int r, int c,List<String> ds,String s){
//         if(r == n-1 || c == n-1){
//             return;
//         }
        
//     }
//     public List<String> letterCombinations(String digits) {
//         List<List<String>> list = new ArrayList<>();
//         Map<Character,  String[]> mpp = new HashMap<>();
//         mpp.put('2', new String[]{"a", "b", "c"});
//         mpp.put('3', new String[]{"d", "e", "f"});
//         mpp.put('4', new String[]{"g", "h", "i"});
//         mpp.put('5', new String[]{"j", "k", "l"});
//         mpp.put('6', new String[]{"m", "n", "o"});
//         mpp.put('7', new String[]{"p", "q", "r", "s"});
//         mpp.put('8', new String[]{"t", "u", "v"});
//         mpp.put('9', new String[]{"w", "x", "y", "z"});
//         List<String> ds = new ArrayList<>();
      
//         char[] input = digits.toCharArray();
//         backtracking(input,mpp,list,input.length,0,0,"");

         
//     }
// }
import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        
        Map<Character, String> mpp = new HashMap<>();
        mpp.put('2', "abc");
        mpp.put('3', "def");
        mpp.put('4', "ghi");
        mpp.put('5', "jkl");
        mpp.put('6', "mno");
        mpp.put('7', "pqrs");
        mpp.put('8', "tuv");
        mpp.put('9', "wxyz");
        
        List<String> result = new ArrayList<>();
        backtrack(digits, 0, new StringBuilder(), result, mpp);
        return result;
    }
    
    private void backtrack(String digits, int index, StringBuilder current,
                           List<String> result, Map<Character, String> mpp) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        
        String letters = mpp.get(digits.charAt(index));
        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(digits, index + 1, current, result, mpp);
            current.deleteCharAt(current.length() - 1);  // Backtrack
        }
    }
}
