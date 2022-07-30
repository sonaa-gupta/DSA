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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
return;
 ListNode h=cutinhalf(head);
        h=reverse(h);
        ListNode p=head;
        while(h.next!=null)
        {
            ListNode x=h.next;
            h.next=p.next;
            p.next=h;
            p=p.next.next;
            h=x;
        }
       
    }
        static ListNode reverse(ListNode head)
    {
       ListNode curr=head,prev=null;
       while(curr!=null)
       {
           ListNode nex=curr.next;
           curr.next=prev;
           prev=curr;
           curr=nex;
       }
       return prev;
    }
   static  ListNode cutinhalf(ListNode head)
    {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
