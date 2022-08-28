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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=head;
        ListNode curr=head.next;
        
        while(prev!=null && curr!=null)
        {
            int z=prev.val;
            prev.val=curr.val;curr.val=z;
            if(curr.next!=null)
            curr=curr.next.next;
            else curr=null;
            if(prev.next!=null)
            prev=prev.next.next;
            else prev=null;
        }
        return head;
    }
}