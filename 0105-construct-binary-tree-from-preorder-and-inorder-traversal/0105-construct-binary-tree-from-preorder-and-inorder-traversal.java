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
class Solution {
    public TreeNode buildTree(int[] preorder,int preSt,int preEnd,int[] inorder,int inSt,int inEnd,Map<Integer,Integer> mpp){
        if(preSt > preEnd || inSt > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preSt]);
        int inRoot = mpp.get(root.val);
        int numsLeft = inRoot - inSt;
        root.left = buildTree(preorder,preSt + 1,preSt + numsLeft,inorder,inSt,inRoot - 1,mpp);
        root.right = buildTree(preorder,preSt + numsLeft + 1,preEnd,inorder,inRoot+1,inEnd,mpp);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0;i<inorder.length;i++){
            mpp.put(inorder[i],i);
        }
        return buildTree(preorder,0,preorder.length - 1,inorder,0,inorder.length-1,mpp);
    }
}