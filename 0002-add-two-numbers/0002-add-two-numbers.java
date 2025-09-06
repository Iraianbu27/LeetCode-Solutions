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
       List<Integer> list = new ArrayList<>();
       while(temp1 != null && temp2 != null)
       {
            ans = temp1.val + temp2.val + borrow;
            borrow = (ans / 10);
            res = ans % 10;
            list.add(res);
            temp1 = temp1.next;
            temp2 = temp2.next;
       }
       if(temp1 == null && temp2 == null)
       {
            
           if(borrow != 0)
           {
            list.add(borrow);
           }
       }
       else{
            while(temp1 != null)
            {
                ans = temp1.val + borrow;
                borrow = (ans /10);
                res = ans % 10;
                list.add(res);
                temp1 = temp1.next;
            }
            while(temp2 != null)
            {
                ans= temp2.val + borrow;
                borrow = (ans /10);
                res = ans % 10;
                list.add(res);
                temp2 = temp2.next;
            }
            if(borrow != 0)
            {
                list.add(borrow);
            }
       }

       ListNode finalLL = new ListNode(list.get(0));
       ListNode mover = finalLL;
       for(int i = 1;i<list.size();i++)
       {
            ListNode temp = new ListNode(list.get(i));
            mover.next = temp;
            mover = temp;
       }
       return finalLL;
    
       
    }
}
     