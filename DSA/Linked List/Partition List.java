//! 86. Partition List
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
    public ListNode partition(ListNode head, int x) {
        ListNode lesser = new ListNode(0);
        ListNode greater = new ListNode(0);

        ListNode lHead = lesser, gHead = greater;

        while (head != null ) {
            if (head.val < x) {
                lHead.next=head;
                lHead=lHead.next;
            }else{
                gHead.next=head;
                gHead=gHead.next;
            }
            head=head.next;
       
            gHead.next=null;
            lHead.next=greater.next;
         }
        return lesser.next;
    }
}