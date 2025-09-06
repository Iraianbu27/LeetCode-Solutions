/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 !=  temp2)
        {
             temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1 == temp2)
            {
                return temp1;
            }
            if(temp1 == null  )
            {
                temp1 = headB;
            }
            else if(temp2 == null  )
            {
                temp2 = headA;
            }
             
           
        }
        return temp1;

    }
}
//BRUTE FORCE O(M*N) TC WITH O(1) SC    
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     ListNode tempA = headA;
        
    //     while(tempA != null)
    //      {
    //         ListNode tempB = headB;
    //         while(tempB != null)
    //         {
    //             if(tempA == tempB)
    //             {
    //                 return tempA;
    //             }
    //             tempB = tempB.next;
    //         }
    //         tempA = tempA.next;
    //     }
    //     return null;
    // }