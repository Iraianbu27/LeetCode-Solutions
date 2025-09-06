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
        ListNode temp = head;
       return merge( temp);
    }
    public static ListNode merge(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        //mid
        ListNode mid = middle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        left = merge(left);
        right = merge(right);
        return mergeSort(left,right);

    }
    //finding the mid
    public static ListNode middle(ListNode head)
    {
        ListNode temp = head;
        ListNode fast = temp;
        ListNode slow = temp;
        while(  fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //merging
    public static ListNode mergeSort(ListNode left,ListNode right)
    {
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        while(left != null && right != null)
        {
            if(left.val <= right.val)
            {
                temp.next = left;
                temp = left;
                left = left.next;
            }
            else{
                temp.next = right;
                temp = right;
                right = right.next;
            }
        }
        if( left != null)
        {
            temp.next = left;
            temp = left;
            // left = left.next;
        }
        else
        {
            temp.next = right;
            temp = right;
            // right = right.next;
        }
        return newHead.next;

    }
}
//BRUTE FORCE USING EXTRA SPACE
// import java.util.*;
// class Solution {
//     public ListNode sortList(ListNode head) {
//         List<Integer> list = new ArrayList<>();
//         ListNode temp = head;
//         ListNode temp1 = head;
//         while(temp != null)
//         {
//             list.add(temp.val);
//             temp = temp.next;
//         }
//         Collections.sort(list);
//         int i = 0;
//         while(temp1 != null)
//         {
//             temp1.val = list.get(i++);
//             temp1 = temp1.next;
//         }
//         return head;
//     }
// }