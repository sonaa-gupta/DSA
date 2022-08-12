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
    public ListNode rotateRight(ListNode head, int k) {
        int i=0;
        ListNode current=head;
        if(head==null || head.next==null) return head;
        while(current!=null)
        { 
            current=current.next;i++;
}
        
        if(k>0) k%=i;
        if(k==0) return head;
        ListNode current2=head;
        int diff=i-k;
        for(int j=1;j<diff;j++)
            current2=current2.next;
        
        ListNode temp=current2.next;
        ListNode nhead=current2.next;current2.next=null;
        
        while(temp.next!=null)
            temp=temp.next;
        
        temp.next=head;
        return nhead;
        
        
    }
}