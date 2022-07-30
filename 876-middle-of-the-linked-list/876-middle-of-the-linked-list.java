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
        ListNode current=head;
        ListNode prev=head;
        while(current !=null  && current.next !=null)
        {
            prev=prev.next;
            current=current.next.next;
          //  current=current.next;
        }
        
        return prev;
         
    }
}