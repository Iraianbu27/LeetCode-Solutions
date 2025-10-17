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
    public void recFunction(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        recFunction(root.left,list);
        recFunction(root.right,list);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recFunction(root,list);        
        return list;










    }
}











