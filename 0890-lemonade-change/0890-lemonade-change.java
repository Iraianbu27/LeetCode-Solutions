// class Solution {
//     public boolean lemonadeChange(int[] bills) {
//         int five = 0;
//         int ten = 0;
//         for(int i = 0;i<bills.length;i++)
//         {
//             if(bills[i] == 5)
//             {
//                 five++;
//             }
//             else if(bills[i] == 10 ){
//                 if(five != 0){
//                     ten++;
//                     five--;
//                 }
//                 else{
//                     return false;
//                 }
                
//             }
//             else if(bills[i] == 20){
//                 if(five != 0 && ten != 0)
//                 {
//                     five--;
//                     ten--;
//                 }
//                 else if(five >= 3){
//                     five = five - 3;
//                 }
//                 else{
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }


class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int amt = 5;
        mpp.put(5,0);
        mpp.put(10,0);
        mpp.put(20,0);

        for(int j = 0;j<bills.length;j++){
            if(bills[j] == 20){
            int ten = mpp.get(10);
            int five = mpp.get(5);
                if(ten >=1 && five >= 1){
                    mpp.put(20,mpp.get(20)+1);
                    mpp.put(10,mpp.get(10)-1);
                    mpp.put(5,mpp.get(5)-1);
                }
                else if(five >=3){
                    mpp.put(5,mpp.get(5)-3);
                    mpp.put(20,mpp.get(20)+1);                    
                }
                else {
                    return false;
                }
            }
 
            else if(bills[j] == 10){
                int five = mpp.get(5);
                if(five >=1){
                    mpp.put(5,mpp.get(5)-1);
                    mpp.put(10,mpp.get(10)+1);
                }
                else{
                    return false;
                }
            }
            else{
                mpp.put(5,mpp.get(5)+1);
            }
        }
        return true;
    }
}























