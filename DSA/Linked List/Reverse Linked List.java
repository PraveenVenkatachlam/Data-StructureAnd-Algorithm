//! LeetCode 206 Reverse Linked List
//*Tco(n) 
//*  Sc o(1)
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
// Time complexity: O(n)
// Space complexity: O(1)
class Solution {
    public ListNode reverseList(ListNode head) {


        ListNode temp=null;

        while(head!= null){

            ListNode pk=head.next;
            head.next=temp;
            temp=head;
            head=pk;
        //    int pn=head.next;
        //    int temp=null;
        
        //   head=temp;
        //    temp=head;

        }
        return temp;
        
    }
}