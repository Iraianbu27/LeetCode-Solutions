class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(String operation : operations){
            if(operation.contains("+")){
                count++;
            }
            else {
                count--;
            }
            // if(operation.equals("X++")){
            //     count += 1;
            // }
            // else if(operation.equals("++X")){
            //     count += 1;
            // }
            // else if(operation.equals("X--")){
            //     count -= 1;
            // }
            // else{
            //     count -= 1;
            // }
        }
        return count;
    }
}