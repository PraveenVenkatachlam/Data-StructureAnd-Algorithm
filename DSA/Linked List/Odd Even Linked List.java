//! 328. Odd Even Linked List
//? Time Complexity: O(n)
//? Space Complexity: O(1)
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
    public ListNode oddEvenList(ListNode head) {
        
        // use counter in brut force

         if(head==null||head.next==null||head.next.next==null)return head;
        ListNode even=head.next,evenHead=head.next;
        ListNode odd=head,oddHead=head;
          while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
         }

             odd.next=evenHead;
             return oddHead;
    }
}