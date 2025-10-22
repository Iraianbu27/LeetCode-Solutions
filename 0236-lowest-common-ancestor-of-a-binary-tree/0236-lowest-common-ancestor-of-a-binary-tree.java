/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 //iterate and find all the path and use backtracking to find it correctly
 //if the root searching for is required then dont go any
class Solution {
    public void node2Leaf(TreeNode root,TreeNode p,TreeNode q,List<TreeNode> list,List<List<TreeNode>> result){
        if(root == null) return;
        list.add(root);
        if(root == p || root == q){
            result.add(new ArrayList<>(list));
        }
        
            node2Leaf(root.left,p,q,list,result);
            node2Leaf(root.right,p,q,list,result);

        list.remove(list.size() - 1);    
     
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)return null;
        List<TreeNode> list = new ArrayList<>();
        List<List<TreeNode>> result = new ArrayList<>();
        node2Leaf(root,p,q,list,result);
        List<TreeNode> list1 = result.get(0);
        List<TreeNode> list2 = result.get(1);
        int len = Math.min(list1.size(),list2.size());
        TreeNode lastNode = null;
        for(int i = 0;i<len;i++){
            if(list1.get(i) == list2.get(i)){
                lastNode = list1.get(i);
            }
            else{
            break;
            }
        }
        return lastNode;

    }
}