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
    public void createCopy(Node head){
        Node temp = head;
        while(temp != null){
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = temp.next.next;
        }
    }
    public void random(Node head){
        Node temp = head;
        while(temp != null){
            if(temp.random != null){
                Node copy = temp.next;
                copy.random = temp.random.next;
            }
            else{
                Node copy = temp.next;
                copy.random = null;
            }
            temp = temp.next.next;
        }
    }
    public Node next(Node head){
        Node temp = head;
        Node dNode = new Node(-1);
        Node res = dNode;
        while(temp != null){
           res.next = temp.next;
           res = temp.next;
           
           temp.next = temp.next.next;
           res.next = null;
           temp = temp.next;           
        }
        return dNode.next;

    }
    public Node copyRandomList(Node head) {
       createCopy(  head);
       random(  head);
       return next(  head);

    }
}
//approach with TC of O(2n) sc O(2N)
// public Node copyRandomList(Node head) {
    //     if(head == null) return head;
    //     Map<Node,Node> mpp = new HashMap<>();  sc  - O(n)
    //     Node temp = head;
    //     //pushing original and copy node to map
    //     while(temp != null){             O(n)
    //         Node copy = new Node(temp.val);  sc - O(n)
    //         mpp.put(temp,copy);
    //         temp = temp.next;
    //     }
    //     temp = head;
    //     //building next to copy 
    //     while(temp != null){    O(n)
            
    //         Node copy = mpp.get(temp);
    //         copy.next = mpp.get(temp.next);
    //         copy.random = mpp.get(temp.random);
            
    //         temp = temp.next;
    //     }
    //     temp = head;
    //     Node copy = mpp.get(temp);
    //     return copy;
    // }