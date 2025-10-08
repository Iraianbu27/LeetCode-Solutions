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
    //1.find mid 
    //2.reverse second half
    //3.compare both
    public static ListNode midValue(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode head)
    {
        ListNode temp = head;
        ListNode prev = null;
        ListNode front;
        while(temp != null)
        {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
       ListNode midNode = midValue(head);
       ListNode reversedNode = reverse(midNode);
      
       ListNode firstPntr =  head; 
       ListNode secondPntr = reversedNode;
       while(secondPntr != null)
       {
        if(firstPntr.val != secondPntr.val)
        {
            return false;
        }
        firstPntr = firstPntr.next;
        secondPntr = secondPntr.next;
       }
       
    //    ListNode actualNode = reverse(reversedNode);
       return true;

    }
}
//brute force using extra space
 // StringBuffer ds = new StringBuffer();
        // ListNode temp = head;
        // while(temp != null)
        // {
        //     ds.append(temp.val);
        //     temp = temp.next;
        // }
        // int l = 0,r=ds.length()-1;
        // while(l<r)
        // {
        //     if(ds.charAt(l) != ds.charAt(r))
        //     {
        //         return false;
        //     }
        //     l++;
        //     r--;
        // }  
        // return true;