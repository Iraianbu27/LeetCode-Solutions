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
    public ListNode middleNode(ListNode head) {
       ListNode single = head;
       ListNode two = head;
       
       while(two != null && two.next != null)
       {
         
            // if(two.next == null)
            // {
            //     break;
            // }
            // else{
            //     single =  single.next ;
            //     break;
            // }
        single = single.next;
        two = two.next.next;
       }
       return single;
}
}
// BRUTE FORCE using two passes(two function)
//class Solution {
//     public int length(ListNode head)
//     {
//         ListNode temp = head;
//         int count = 0;
//         while( temp != null)
//         {
//             count++;
//             temp = temp.next;
//         }
//         return count;
//     }
//     public ListNode middleNode(ListNode head) {
//        int count = length(head);
//        int middle = (count/2) + 1;
       
//        ListNode temp = head;
       
//        while(temp != null)
//        {
//         middle--;
//         if(middle == 0)
//         {
//             break;
//         }
//         temp = temp.next;
//        }
//        return temp;
//     }
// }