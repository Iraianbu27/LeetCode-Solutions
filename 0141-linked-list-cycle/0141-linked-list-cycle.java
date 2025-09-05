/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Integer> mpp = new HashMap<>();
        if(head == null)
        {
            return false;
        }
        ListNode temp = head;
        while(temp != null)
        {
            if(!mpp.containsKey(temp)){
                 
                mpp.put(temp,1);
            }
            else{
                return true;
            }
            temp = temp.next;

        }
        return false;
    }
}