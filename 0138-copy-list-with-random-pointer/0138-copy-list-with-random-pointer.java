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
            if(temp.next != null){
                Node copy = mpp.get(temp);
                copy.next = mpp.get(temp.next);
            }
            else{
                Node copy = mpp.get(temp);
                copy.next = null;
            }
            temp = temp.next;
        }

        //building random to cpy
        temp = head;
        while(temp != null){
            if(temp.random == null){
                Node copy = mpp.get(temp);
                copy.random = null;
            }
            else{
                Node copy = mpp.get(temp);
                copy.random = mpp.get(temp.random);
            }
            temp = temp.next;
        }
        temp = head;
        Node copy = mpp.get(temp);
        return copy;
    }
}