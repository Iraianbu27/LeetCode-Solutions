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
    public List<List<Integer>> levelOrderTraverse(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)return list;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        // int level = 0;
        boolean toggle = false;
        while(!qu.isEmpty()){
            int size = qu.size();
            List<Integer> nodes = new ArrayList<>();
            // level += 1;

            for(int i = 0;i<size;i++){
                TreeNode top = qu.poll();
                if(top.left != null) qu.offer(top.left);
                if(top.right != null) qu.offer(top.right);
                nodes.add(top.val);
            }
            if(toggle){
                Collections.reverse(nodes);
            }
            list.add(nodes);
            toggle = !toggle;
            // if(level %2 == 0) {
            //     Collections.reverse(nodes);
            //     list.add(new ArrayList<>(nodes));
            // }
            // else{
            //     list.add(new ArrayList<>(nodes));
            // }
            
        }
        return list;

    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        return levelOrderTraverse(root);
    }
}