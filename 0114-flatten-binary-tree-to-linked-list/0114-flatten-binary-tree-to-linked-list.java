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
 
 //mories approach
 class Solution{
    public void flatten(TreeNode root) { 
        TreeNode currNode = root;
        while(currNode != null){
            if(currNode.left == null){
                currNode = currNode.right;
            }
            else{
                TreeNode temp = currNode.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                temp.right = currNode.right;
                currNode.right = currNode.left;
                currNode.left = null;
                currNode = currNode.right;
                
            }
        }
    }
 }

 //stack method
// class Solution { 
    // public void flatten(TreeNode root) { 
    //     Stack<TreeNode> stack = new Stack<>();
    //     if(root != null) stack.push(root);
    //     // TreeNode prevNode = stack.peek();
    //     while(!stack.isEmpty())
    //     {
    //         TreeNode temp = stack.pop();
    //         if(temp.right != null) stack.push(temp.right);
    //         if(temp.left != null) stack.push(temp.left);
    //         if(!stack.isEmpty()) temp.right = stack.peek();
    //         temp.left = null;
    //     }
    // }
// }


 //RECURSIVE SOLUTION

// class Solution {
//     TreeNode prevNode = null;
//     public void dfs(TreeNode root){
//         if(root == null)return;
//         dfs(root.right);
//         dfs(root.left);
//         root.right = prevNode;
//         root.left = null;
//         prevNode = root;
//     }
//     public void flatten(TreeNode root) { 
//         dfs(root);
//         // return root;
//     }
// }