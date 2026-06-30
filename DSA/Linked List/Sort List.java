//! 148 Leetcode Sort List
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
         return head;
        }
      ListNode middle = middleNode(head);
      ListNode left = sortList(head);
      ListNode right = sortList(middle);

      return mergeTwoLists(left,right);
    }
//!
    public ListNode middleNode(ListNode head) {
        ListNode slow= head, fast=head, prev=null;
        while(fast!=null && fast.next!=null){
        prev=slow;
        slow=slow.next;
        fast=fast.next.next;
        }
        if(prev!=null)  prev.next=null;
        return slow;
    }
 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode res= new ListNode(-1);
        ListNode dummy=res;

        while(list1!= null && list2!= null){

            if(list1.val <list2.val){
            res.next=list1;
            list1=list1.next;
            }else {
                res.next=list2;
            list2=list2.next;
            }
            res=res.next;
        }
        res.next =(list1!=null) ? list1 : list2;
        return dummy.next;
    }
}