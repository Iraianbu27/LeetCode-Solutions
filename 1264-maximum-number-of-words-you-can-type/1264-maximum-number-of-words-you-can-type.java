class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        String[] arr = text.split(" ");
        int output = arr.length ;
        for(char letter : brokenLetters.toCharArray())
        {
            for(int i = 0;i<arr.length;i++)
            {
                if(arr[i].contains(String.valueOf(letter))){
                    arr[i] = " ";
                    output--;
                }
            }
        }
        return output;
    }
}