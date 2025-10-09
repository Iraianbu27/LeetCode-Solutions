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
    ListNode head1 = l1;
    ListNode head2 = l2;
    int carry = 0;
    ListNode head = new ListNode(-1);
    ListNode newHead = head;
    int add = 0;
    while(head1 != null || head2 != null){
        int val1 = 0;
        int val2= 0;
        if(head1 != null )  val1 = head1.val;
        if(head2 != null)  val2 = head2.val;
        int sum = val1 + val2 + carry;
        carry = sum/10;
        add = sum % 10;
        ListNode number = new ListNode(add);
        newHead.next = number;
        newHead = number;
        if(head1 != null) head1 = head1.next;
        if(head2 != null) head2 = head2.next;
             
    }
    if(carry != 0){
        ListNode c = new ListNode(carry);
        newHead.next = c;
        newHead = c;

    }
    return head.next;
 }
}
//MY APPROACH USING EXTRA SPACE 
// class Solution {

//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode temp1 = l1;
//        ListNode temp2 = l2;
//        int ans = 0;
//        int borrow = 0;
//        int res = 0;
//        List<Integer> list = new ArrayList<>();
//        ListNode dummy = new ListNode(-1);
//        ListNode mover = dummy;

//        while(temp1 != null && temp2 != null)
//        {
//             ans = temp1.val + temp2.val + borrow;
//             borrow = (ans / 10);
//             res = ans % 10;
//             // list.add(res);
//             ListNode newNode = new ListNode(res);
//             mover.next = newNode;
//             mover = newNode;
//             temp1 = temp1.next;
//             temp2 = temp2.next;
//        }
//        if(temp1 == null && temp2 == null)
//        {

//            if(borrow != 0)
//            {
//                             ListNode newNode = new ListNode(borrow);
//                 mover.next = newNode;
//                 mover = newNode;
//            }
//        }
//        else{
//             while(temp1 != null)
//             {
//                 ans = temp1.val + borrow;
//                 borrow = (ans /10);
//                 res = ans % 10;
//                 // list.add(res);
//                             ListNode newNode = new ListNode(res);
//             mover.next = newNode;
//             mover = newNode;
//                 temp1 = temp1.next;
//             }
//             while(temp2 != null)
//             {
//                 ans= temp2.val + borrow;
//                 borrow = (ans /10);
//                 res = ans % 10;
//                 // list.add(res);
//                            ListNode newNode = new ListNode(res);
//             mover.next = newNode;
//             mover = newNode;
//                 temp2 = temp2.next;
//             }
//             if(borrow != 0)
//             {
//                 ListNode newNode = new ListNode(borrow);
//                 mover.next = newNode;
//                 mover = newNode;
//             }
//        }

//     //    ListNode finalLL = new ListNode(list.get(0));
//     //    ListNode mover = finalLL;
//     //    for(int i = 1;i<list.size();i++)
//     //    {
//     //         ListNode temp = new ListNode(list.get(i));
//     //         mover.next = temp;
//     //         mover = temp;
//     //    }
//        return dummy.next;

//     }
// }






//  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//     ListNode head1 = l1;
//     ListNode head2 = l2;
//     int carry = 0;
//     ListNode head = new ListNode(-1);
//     ListNode newHead = head;
//     int add = 0;
//     while(head1 != null || head2 != null){
//         int val1 = 0;
//         int val2= 0;
//         if(head1 != null )  val1 = head1.val;
//         if(head2 != null)  val2 = head2.val;
//         int sum = val1 + val2 + carry;
//         carry = sum/10;
//         add = sum % 10;
//         ListNode number = new ListNode(add);
//         newHead.next = number;
//         newHead = number;
//         if(head1 != null) head1 = head1.next;
//         if(head2 != null) head2 = head2.next;
             
//     }
//     if(carry != 0){
//         ListNode c = new ListNode(carry);
//         newHead.next = c;
//         newHead = c;

//     }
//     return head.next;
//  }



























