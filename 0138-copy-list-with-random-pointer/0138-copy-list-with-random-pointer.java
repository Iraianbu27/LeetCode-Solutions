/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        Map<Node,Node> mpp = new HashMap<>();
        Node temp = head;
        //pushing original and copy node to map
        while(temp != null){
            Node copy = new Node(temp.val);
            mpp.put(temp,copy);
            temp = temp.next;
        }
        temp = head;
        //building next to copy 
        while(temp != null){
            
            Node copy = mpp.get(temp);
            copy.next = mpp.get(temp.next);
            copy.random = mpp.get(temp.random);
            
            temp = temp.next;
        }
        temp = head;
        Node copy = mpp.get(temp);
        return copy;
    }
}