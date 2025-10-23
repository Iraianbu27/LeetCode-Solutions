/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution{
    public int getLeftHeight(TreeNode root){
        int count = 0;
        while(root != null){
            count++;
            root=root.left;
        }
        return count;
    }
    public int getRightHeight(TreeNode root){
        int count = 0;
        while(root != null){
            count++;
            root = root.right;
        }
        return count;
    }
    public int dfs(TreeNode root){
        if(root == null)return 0;
        int lH = getLeftHeight(root);
        int rH = getRightHeight(root);
        if(lH == rH){
            return (1<<lH)-1;
        }
        else{
            return (dfs(root.left) + dfs(root.right) + 1);
        }
    }
    public int countNodes(TreeNode root) {
        return dfs(root);
    }
}

//O(N) appraoch
// class Solution {
//     public void dfs(TreeNode root,int[] count){
//         if(root == null) return;
//         count[0]++;
//         dfs(root.left,count);
//         dfs(root.right,count);
//     }
    // public int countNodes(TreeNode root) {
    //     int[] count = new int[1];
    //     dfs(root,count);
    //     return count[0];
    // }
// }