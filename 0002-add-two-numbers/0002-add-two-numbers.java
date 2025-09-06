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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode temp1 = l1;
       ListNode temp2 = l2;
       int ans = 0;
       int borrow = 0;
       int res = 0;
     
       ListNode dummy = new ListNode(-1);
       ListNode mover = dummy;
       while(temp1 != null || temp2 != null)
       {
            ans =  borrow;
           
            // list.add(res);
            if(temp1 != null) 
            {
                ans += temp1.val;
                temp1 = temp1.next;
            }
            if(temp2 != null)
            {
                ans += temp2.val;
                temp2 = temp2.next;
            }
            borrow = (ans / 10);
            res = ans % 10;
            ListNode newNode = new ListNode(res);
            mover.next = newNode;
            mover = newNode;
            // if(temp1 != null) temp1 = temp1.next;
            // if(temp2 != null) temp2 = temp2.next;
       }
        if(borrow != 0)
        {
            ListNode newNode = new ListNode(borrow);
            mover.next = newNode;
            mover = newNode;
        }
 
       

    //    ListNode finalLL = new ListNode(list.get(0));
    //    ListNode mover = finalLL;
    //    for(int i = 1;i<list.size();i++)
    //    {
    //         ListNode temp = new ListNode(list.get(i));
    //         mover.next = temp;
    //         mover = temp;
    //    }
       return dummy.next;
    
       
    }
}
     