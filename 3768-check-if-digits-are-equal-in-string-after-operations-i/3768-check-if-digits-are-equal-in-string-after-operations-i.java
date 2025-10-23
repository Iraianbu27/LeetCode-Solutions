class Solution {
    public boolean hasSameDigits(String s) {
        char[] charArr = s.toCharArray();
        List<Integer> arr = new ArrayList<>();
        for(char i : charArr){
            arr.add(i - '0');
        }
        while(arr.size() > 2){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<arr.size()-1;j++){
                int replace =  (arr.get(j)+arr.get(j+1))%10;
                list.add(replace);
            }
            arr = list;
        }
        if(arr.get(0) == arr.get(1))return true;
        return false;

    }
}