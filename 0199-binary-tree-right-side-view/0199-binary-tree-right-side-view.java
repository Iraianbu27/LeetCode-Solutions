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
    public List<Integer> bfs(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null)return list;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int size = qu.size();
            
            for(int i = 0;i<size;i++){
                TreeNode temp = qu.poll();

                if(temp.left != null)qu.offer(temp.left);
                if(temp.right !=null)qu.offer(temp.right);
                if(i == size - 1){
                    list.add(temp.val);
                }
            }
        }
        return list;
    }
    public List<Integer> rightSideView(TreeNode root) {
        return bfs(root);
    }
}