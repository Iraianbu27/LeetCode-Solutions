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
    public boolean isPalindrome(ListNode head) {
        StringBuffer ds = new StringBuffer();
        ListNode temp = head;
        while(temp != null)
        {
            ds.append(temp.val);
            temp = temp.next;
        }
        int l = 0,r=ds.length()-1;
        while(l<r)
        {
            if(ds.charAt(l) != ds.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
}