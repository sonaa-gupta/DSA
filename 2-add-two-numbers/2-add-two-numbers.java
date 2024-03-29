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
        
        ListNode dummy= new ListNode(0);
        ListNode head=dummy;
        int carry=0;
        
        while(l1!=null || l2!=null)
        {
            int sum=0;
            if(l1!=null)
                sum+=l1.val;
            if(l2!=null)
                sum+=l2.val;
            
        sum+=carry;
            if(sum>9)
            {
                carry=sum/10;
                sum=sum%10;
            }
            else carry=0;
            
            head.next=new ListNode(sum);
            head=head.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            
            
        }
        if(carry>0){
            head.next=new ListNode(carry);
            head=head.next;}
        
        return dummy.next;
    }
}