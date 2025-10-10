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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        if(head == null || temp.next == null){
            return head;
        }
        int count = 1;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        temp.next = head;
        
        int i = 0;
        k = k % count;
        if(k == 0) {
            temp.next = null;
            return head;
        }
        int rem = count - k;
        temp = head;
        while(temp != null){
            i += 1;
            if(i == rem) break;
            temp = temp.next;
        }

        ListNode fresh = temp.next;
        temp.next = null;
        return fresh;

    }
}
        // ListNode newHead = head;
        // if(head == null || head.next == null) return head;
        // for(int i = 0;i<k;i++){
        //     ListNode temp = newHead;
        //     ListNode prev = null;
        //     while(temp.next != null){
        //         prev = temp;
        //         temp = temp.next;
        //     }
        //     prev.next = null;
        //     temp.next = head;
        //     newHead = temp;
        // }
        // return newHead;