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
    int ver;
    int level;
    public Pair(TreeNode root,int ver,int level){
        this.root = root;
        this.ver = ver;
        this.level = level;
    }
 }
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> mpp = new TreeMap<>();
        if(root == null) return list;
        Queue<Pair> qu = new LinkedList<>();
        qu.offer(new Pair(root,0,0));
        while(!qu.isEmpty()){
            Pair curr = qu.poll();
            int size = qu.size();
            TreeNode node = curr.root;
            int cVer = curr.ver;
            int cLevel = curr.level;
            //put cver-- vertical index and create map inside it
            if(!mpp.containsKey(cVer)){
                mpp.put(cVer,new TreeMap<>());
            }
            
            //put cLevel -- level  and create a priority quey inside it
            if(!mpp.get(cVer).containsKey(cLevel)){
                mpp.get(cVer).put(cLevel,new PriorityQueue<>());
            }
            mpp.get(cVer).get(cLevel).offer(node.val);

            // mpp.containsKey(cVer);
            if(node.left != null) qu.offer(new Pair(node.left,cVer - 1,cLevel + 1));
            if(node.right != null) qu.offer(new Pair(node.right,cVer + 1,cLevel + 1));
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> value : mpp.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> pq : value.values()){
                while(!pq.isEmpty()){
                    list.get(list.size() - 1).add(pq.poll());
                }
            }
        }
        return list;

    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        return levelOrder(root);
    }
}






















