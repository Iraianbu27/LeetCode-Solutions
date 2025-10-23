/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> bfs(TreeNode root,int k,Map<TreeNode,TreeNode> mpp){
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> qu = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        qu.offer(root);
        visited.add(root);
        int depth = 0;
        while(!qu.isEmpty()){
            if(depth == k) {
               break;
            }
            int size = qu.size();
            for(int i = 0;i<size;i++){
                TreeNode currNode = qu.poll();
                boolean isContain = mpp.containsKey(currNode);
                
                if(mpp.containsKey(currNode) && !visited.contains(mpp.get(currNode))){
                    TreeNode temp = mpp.get(currNode);
                    qu.offer(temp);
                    visited.add(temp);
                }
                if(currNode.left != null && !visited.contains(currNode.left)){
                    qu.offer(currNode.left);
                    visited.add(currNode.left);
                }
                if(currNode.right != null && !visited.contains(currNode.right)){
                    qu.offer(currNode.right);
                    visited.add(currNode.right);
                }
            }
            depth += 1;
        }

        while(!qu.isEmpty()){
                        
            list.add(qu.peek().val);
            qu.poll();
        }
    return list;
    }
    public TreeNode dfs(TreeNode root,TreeNode target){
        if(root == null) return null;
        if(root == target) return root;
        
        TreeNode leftTree = dfs(root.left,target);
        TreeNode rightTree = dfs(root.right,target);
        if(leftTree != null)return leftTree;
        else if(rightTree != null) return rightTree;
        else return null;
    }
    public void parentMapping(TreeNode root,Map<TreeNode,TreeNode> mpp){
        
        if(root.left != null){
            mpp.put(root.left,root);
            parentMapping(root.left,mpp);
        }
        if(root.right != null){
            mpp.put(root.right,root);
            parentMapping(root.right,mpp);
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        // List<Integer> list = new ArrayList<>();
        //if root and target are null return nulll
        if(root == null || target == null)return new ArrayList<>();

        //mapping parent for all nodes
        Map<TreeNode,TreeNode> mpp = new HashMap<>();
        parentMapping(root,mpp);

        //using dfs find the target node
        TreeNode targetRoot = dfs(root,target);
        return bfs(targetRoot,k,mpp);

    }
}