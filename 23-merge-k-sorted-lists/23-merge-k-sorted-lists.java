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
    public ListNode mergeKLists(ListNode[] lists) {
        
        List<Integer> l=new ArrayList<>();
        
        for(ListNode ls:lists)
        {
            while(ls!=null){
            l.add(ls.val);
            ls=ls.next;}
        }
        Collections.sort(l);
        ListNode ld=new ListNode(0);
        ListNode head=ld;
        for(int i=0;i<l.size();i++)
        {
            ld.next=new ListNode(l.get(i));
            ld=ld.next;
}
        return head.next;
    }
}