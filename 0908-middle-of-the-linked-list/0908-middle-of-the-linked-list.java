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
    public int length(ListNode head)
    {
        ListNode temp = head;
        int count = 0;
        while( temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public ListNode middleNode(ListNode head) {
       int count = length(head);
       int middle = (count/2) + 1;
       
       ListNode temp = head;
       
       while(temp != null)
       {
        middle--;
        if(middle == 0)
        {
            break;
        }
        temp = temp.next;
       }
       return temp;
    }
}