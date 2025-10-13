import java.util.*;
class Solution {
    public boolean anagram(String word1,String word2){
        if(word1.length() != word2.length()) return false;
        int[] letters = new int[26];
        for(int i = 0;i<word1.length();i++){
            letters[word1.charAt(i) - 'a'] += 1;
            letters[word2.charAt(i) - 'a'] -= 1;
        }
        for(int i:letters){
            if(i != 0) return false;
        }
        return true;
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i = 1;i<words.length;i++){
            if(anagram(words[i-1],words[i]) == false){
                list.add(words[i]);
            }
            // else if(i)
            else{
                continue;
            }
        }
        // list.add(words[words.length-1]);
        
    return list;
    }
}