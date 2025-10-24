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
    public TreeNode constructTree(int[]postorder,int postStart,int postEnd,int[] inorder,int inStart,int inEnd,Map<Integer,Integer> mpp){
        if(postStart > postEnd || inStart > inEnd) return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int inRoot = mpp.get(root.val); //getting index of root in inorder ds to find the potential root.left and root.right
        int numsLeft = inRoot - inStart;

        root.left = constructTree(postorder,postStart,postStart + numsLeft-1,inorder,inStart,inRoot - 1,mpp);
        root.right = constructTree(postorder,postStart+numsLeft,postEnd-1,inorder,inRoot+1,inEnd,mpp);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0;i<inorder.length  ;i++){
            mpp.put(inorder[i],i);
        }
        return constructTree(postorder,0,postorder.length-1,inorder,0,inorder.length-1,mpp);
    }
}










