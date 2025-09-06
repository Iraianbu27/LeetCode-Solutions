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
 import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        ListNode temp1 = head;
        while(temp != null)
        {
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        int i = 0;
        while(temp1 != null)
        {
            temp1.val = list.get(i++);
            temp1 = temp1.next;
        }
        return head;
    }
}