/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 //implemented the both approach for general bfs using for and without for
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder data = new StringBuilder();
        if(root == null)return data.toString();

        //if actually root exists serialize it

        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        data.append(root.val).append(',');
        while(!qu.isEmpty()){
            TreeNode temp = qu.poll();
            // data.append(temp.val).append(',');
            if(temp.left != null){
                qu.offer(temp.left);
                data.append(temp.left.val).append(',');
            }
            else{
                data.append('#').append(',');
            }
            if(temp.right != null){
                qu.offer(temp.right);
                data.append(temp.right.val).append(',');
            }
            else{
                data.append('#').append(',');
            }
            
            
        }
        return data.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        //String data ="1 2 3 # # 9 5 # # # #"
        if(data.length() < 1)return null;
        String[] arr = new String[data.length()];
        arr=data.split(",");
        Queue<TreeNode> qu = new LinkedList<>();
        int index = 0;
        qu.offer(new TreeNode(Integer.parseInt(arr[index++])));
        TreeNode realRoot = qu.peek();
        while(!qu.isEmpty() && index < arr.length){
            int size = qu.size();
            
            for(int i = 0;i<size;i++){
                TreeNode root = qu.poll();
                //left child
               if(arr[index].equals("#")){ //
                root.left = null;
               }else{
                TreeNode left=new TreeNode(Integer.parseInt(arr[index]));
                root.left = left;
                qu.offer(left);
               }index++;

               //right child
               if(arr[index].equals("#")){ //
                root.right = null;
               }else{
                TreeNode right = new TreeNode(Integer.parseInt(arr[index]));
                root.right = right;
                qu.offer(right);
               }index++;
 
            }
        }
        return realRoot;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));



// public List<Integer> bfs(TreeNode root){
//     List<Integer> list = new ArrayList<>();
//     if(root == null)return list;
//     Queue<TreeNode> queue = new LinkedList<>();
//     queue.offer(root);
    
//     while(!queue.isEmpty()){
//         int size = queue.size();
//         for(int i = 0;i<size;i++){
//             list.add(qu.peek().val);
//             TreeNode temp = queue.poll();
//             if(temp.left != null)qu.offer(temp.left);
//             if(temp.right != null)qu.offer(temp.right);
//         }
//     }
//     return list;
// }

// public List<Integer> bfs(TreeNode root){
//     List<Integer> list = new ArrayList<>();
//     if(root == null)return list;
//     Queue<TreeNode> qu = new LinkedList<>();
//     queue.offer(root);
//     while(!queue.isEmpty()){
//         TreeNode temp = qu.poll();
//         list.add(temp.val);
//         if(temp.left != null)qu.offer(temp.left);
//         if(temp.right != null)qu.offer(temp.right);
//     }
//     return list;
// }

















