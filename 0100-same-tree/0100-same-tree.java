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
    public boolean isSameTree(TreeNode p, TreeNode q) { 
    if(p == null || q == null){
        if(q != p) return false;
        return true;
    }
    if((q.val == p.val) && (isSameTree(p.left,q.left) == true) && (isSameTree(p.right,q.right) == true)){
            return true;
        }
    
    
    return false;
    }
 }
 //this wont work
// class Solution {
//     public void recFunction(TreeNode node,List<Integer> list){
//         if(node== null) return;
//         list.add(node.val);
//         recFunction(node.left,list);
//         recFunction(node.right,list);
//     }
//     public List<Integer> preOrder(TreeNode node){
//         List<Integer> list = new ArrayList<>();
//         recFunction(node,list);
//         return list;
//     }
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         List<Integer> l1 = preOrder(p);
//         List<Integer> l2 = preOrder(q);
//         int index = 0;
//         for(int i:l1){
//             if(i != l2.get(index)){
//                 return false;
//             }
//             index += 1;
//         }
//         return true;
//     }
// }