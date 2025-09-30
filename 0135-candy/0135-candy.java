class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int i = 1;
        int candies = 1;
        while(i<n){
            if(ratings[i] == ratings[i-1]){
                candies += 1;
                i++;
                continue;
            }
            // increasing slope
            int peak = 1;
            while(i < n && ratings[i] > ratings[i-1]){
                peak += 1;
                candies += peak;
                
                i++;
            }
            int down = 1;
            while(i < n && ratings[i] < ratings[i-1]){
                candies += down;
                down += 1;
                i++;
            }
            if(down > peak){
                candies += down - peak;
            }
        }
        return candies;
    }
}
//brute 
// First pass: left to right
// int[] left = new int[n];
// left[0] = 1;
// for(int i = 1; i < n; i++){
//     if(ratings[i] > ratings[i - 1]){
//         left[i] = left[i - 1] + 1;
//     } else {
//         left[i] = 1;
//     }
// }

// // Second pass: right to left (reusing left array)
// for(int i = n - 2; i >= 0; i--){
//     if(ratings[i] > ratings[i + 1]){
//         left[i] = Math.max(left[i], left[i + 1] + 1);
//     }
// }

// // Sum up total candies
// int sum = 0;
// for(int candy : left){
//     sum += candy;
// }
// return sum;