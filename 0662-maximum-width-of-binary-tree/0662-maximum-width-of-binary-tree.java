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
 class Pair{
    TreeNode root;
    int index;
    public Pair(TreeNode root,int index){
        this.root = root;
        this.index = index;
    }
 }
class Solution {
    public int bfs(TreeNode root){
        if(root == null)return 0;
        Queue<Pair> qu = new LinkedList<>();
        qu.offer(new Pair(root,0));
        int ans = 0;
        while(!qu.isEmpty()){
            int size = qu.size();
            // Pair currentPair = qu.peek();
            // TreeNode currNode = currentPair.root;
            int firstIndex = qu.peek().index;
            int first = 0;
            int last = 0;
            for(int i = 0;i<size;i++){
                int currIndex = qu.peek().index - firstIndex;
                TreeNode currNode = qu.peek().root;
                qu.poll();
                if(i == 0) first = currIndex;
                 if(i==size-1)last = currIndex;
                if(currNode.left != null){
                    qu.offer(new Pair(currNode.left,2*currIndex + 1)); 
                }  
                if(currNode.right != null){
                    qu.offer(new Pair(currNode.right,2*currIndex + 2));
                } 
            }
            ans = Math.max(last-first+1,ans);
        }
        return ans;
    }
    public int widthOfBinaryTree(TreeNode root) {
        return bfs(root);
    }
}