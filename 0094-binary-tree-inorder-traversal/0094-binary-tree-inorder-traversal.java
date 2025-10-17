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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>(); 
        Stack<TreeNode> st = new Stack<>();
        // st.add(root);
        TreeNode node = root;
        while(node != null || !st.isEmpty()){
            //traversing to the left most node
            while(node!=null){
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            list.add(node.val);

            //check for right child
            node = node.right;

        }
        return list;
    }
}
//USING RECURSSION
// class Solution {
//     public void recFunction(TreeNode root,List<Integer> list){
//         if(root == null) return;
//         recFunction(root.left,list);
//         list.add(root.val); // in this point root node comes after left and right node comes at last 
//         recFunction(root.right,list);

//     }
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         recFunction(root,list);
//         return list;
//     }
// }