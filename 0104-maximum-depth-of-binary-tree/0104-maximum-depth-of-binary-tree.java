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
 class Pair{
    TreeNode node;
    int depth;
    public Pair(TreeNode node,int depth){
        this.node = node;
        this.depth = depth;
    }
 }
 class Solution { 
    public int maxDepth(TreeNode root) {
        Stack<Pair> st = new Stack<>();
        if(root == null) return 0;
        st.push(new Pair(root,1));
        int maxDepth = 0;
        while(!st.isEmpty()){
            Pair pair = st.pop();
            TreeNode curr = pair.node;
            int depth = pair.depth;
            maxDepth = Math.max(maxDepth,depth);
            if(curr.left != null) st.push(new Pair(curr.left,depth+1));
            if(curr.right != null) st.push(new Pair(curr.right,depth+1));
        }
        return maxDepth;
        
    }
}
// class Solution {
//     public int recFunction(TreeNode root){
//         if(root == null) 
//         {
//             return 0;
//         }
//         int left = recFunction(root.left);
//         int right = recFunction(root.right);
//         // return Math.max(recFunction(root.left),recFunction(root.right)) + 1;
//         return Math.max(left,right) + 1;
//     }
//     public int maxDepth(TreeNode root) {
//         return recFunction(root);
        
//     }
// }