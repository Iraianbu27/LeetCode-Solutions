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
    public void recFunction(TreeNode root,List<List<Integer>> list,int level){
        if(root == null) return;
        if(level == list.size()){
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        recFunction(root.left,list,level+1);
        recFunction(root.right,list,level+1);
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        recFunction(root,list,0);
        return list;
  
    }
}
 //using deque approach
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
        
//         List<List<Integer>> list = new ArrayList<>();
//         if(root == null) return list;
//         Deque<TreeNode> dq = new ArrayDeque<>();
//         dq.addLast(root);
//         while(!dq.isEmpty()){
//             List<Integer> nodes = new ArrayList<>();
//             int size = dq.size();
//             for(int i = 0;i<size;i++){
//                 TreeNode node = dq.removeFirst();
//                 if(node.left != null) dq.addLast(node.left);
//                 if(node.right != null) dq.addLast(node.right);
//                 nodes.add(node.val);
//             }
//             list.add(nodes);
//         }
//         return list;
//     }
// }