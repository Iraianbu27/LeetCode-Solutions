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
 //morries algo
 //1.case if left node is empty thn current node stands at root so print it and go through the new threads
 //2.if the current node just passed throught the nwe thread then make the thread points to null coz its job is done
 //3.which direction current moves after coming back from new thread go right(left is processed) , if the thread is just created then go right(left is not processed yet)
 class Solution { 
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        while(root != null){
            if(root.left == null){
                list.add(root.val);
                root = root.right;
            }
            else{
                TreeNode temp = root.left;
                while(temp.right != null && temp.right != root){
                    temp = temp.right;
                }
                if(temp.right == null){
                    temp.right = root;    //right thread builded to the root node from right most node on left sub tree
                    root = root.left;
                }
                else{
                    temp.right = null;
                    list.add(root.val);
                    root = root.right;   
                }
            }
        }
        return list;
    }
}
 //iterative method
// class Solution { 
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>(); 
//         Stack<TreeNode> st = new Stack<>();
//         // st.add(root);
//         TreeNode node = root;
//         while(node != null || !st.isEmpty()){
//             //traversing to the left most node
//             while(node!=null){
//                 st.push(node);
//                 node = node.left;
//             }
//             node = st.pop();
//             list.add(node.val);

//             //check for right child
//             node = node.right;

//         }
//         return list;
//     }
// }
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