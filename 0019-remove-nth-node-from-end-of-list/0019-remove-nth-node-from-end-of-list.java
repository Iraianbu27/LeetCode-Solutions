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
        
        
        // for(int i = 0;i<n;i++)
        // {
        //     fast = fast.next;
        // }
        int sum = 1;
        while(fast != null){
            if(fast.next == null){
                break;
            }
            if(fast.next.next == null){
                sum = sum + 1;
                break;
            }
          
            sum = sum + 2;
            fast = fast.next.next;
        }
        int rem = sum-n;
        //remove head
        //fast == null
        if(rem == 0)
        {
            return head.next;
        }
 
        // while(fast != null && fast.next != null)
        // {
        //     slow = slow.next;
        //     fast = fast.next;
        // }
        ListNode prev = null;
        // Node front = null;
        for(int i = 0;i<rem;i++){
             
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;
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