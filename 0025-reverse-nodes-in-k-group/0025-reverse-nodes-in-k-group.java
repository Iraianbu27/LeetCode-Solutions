/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode counter(ListNode temp,int k){
        int count = 0;
      
        while(temp != null){
            count += 1;
            if(count == k){
                return temp;
            }    
            temp = temp.next;
        }
        return null;
    }
    public ListNode reverse(ListNode temp,ListNode kthNode){
        ListNode prev = null;
        ListNode front = null;
        while(temp != null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    // public ListNode main(ListNode head,int k){

    // }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode prevNode = null;
        while(temp != null){
            ListNode kthNode = counter(temp,k);
            if(kthNode == null){
                if(prevNode != null) prevNode.next = temp;
                return head;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null; 
            ListNode newHead = reverse(temp,kthNode);
            if(temp == head){
                head = newHead;
                prevNode = temp;
            }
            else{
                prevNode.next = newHead;
                prevNode = temp;
            }
            temp = nextNode;
            
        }
        return head;

    }
}
