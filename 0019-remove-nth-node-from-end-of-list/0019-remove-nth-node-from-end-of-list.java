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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        if(head == null ) return head;
        if(head.next == null && n == 1) 
        {
            return null;
        }
        
        
        for(int i = 0;i<n;i++)
        {
            fast = fast.next;
        }
        //remove head
        if(fast == null)
        {
            return head.next;
        }
 
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
//BRUTE FORCE USING TWO PASS
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         int lengthHead = length( head);
//         ListNode temp = head;
//         int index = lengthHead - n;
//         int count = 0;
//         if(head == null) return head;
//         //remove at head
//         if(index == 0)
//         {
//             return head.next;
//         }
//         while(temp != null)
//         {
//             if(count + 1 == index)
//             {
                 
//                     temp.next = temp.next.next;
//                     break;
//             }
//             count++;
//             temp = temp.next;
//         }
//         return head;

//     }
//     public static int length(ListNode head)
//     {
//         int count = 0;
//         ListNode temp = head;
//         while(temp != null)
//         {
//             count++;
//             temp = temp.next;
//         }
//         return count;
//     }
// }